package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Empresa {
	private String cuit;
	private String nombre;
	private int capDepositoFrio;
	private int capDepositoComun;
	// private Paquete[] depositoFrio;
	// private Paquete[] depositoComun;
	private ArrayList<Paquete> depositoFrio;
	private ArrayList<Paquete> depositoComun;
	private HashSet<Viaje> destinos;
	private HashMap<String, Transporte> transportes;

	// Constructor de la empresa.
	// public Empresa(String cuit, String nombre, int capacidadDeCadaDeposito) {
	public Empresa(String cuit, String nombre, int capDeposito) {
		this.cuit = cuit;
		this.nombre = nombre;
		this.capDepositoFrio = capDeposito;
		this.capDepositoComun = capDeposito;
		this.destinos = new HashSet<Viaje>();
		this.depositoFrio = new ArrayList<Paquete>();
		this.depositoComun = new ArrayList<Paquete>();
		this.transportes = new HashMap<String, Transporte>();
	};

	// Incorpora un nuevo destino y su distancia en km.
	// Es requisito previo, para poder asignar un destino a un transporte.
	// Si ya existe el destino se debe generar una excepción.
	public void agregarDestino(String destino, int km) {
		Viaje viaje = new Viaje(destino, km);

		if (!existeDestino(destino))
			destinos.add(viaje);
		else
			throw new RuntimeException("El destino ya existe");

	};

	// Los siguientes métodos agregan los tres tipos de transportes a la
	// empresa, cada uno con sus atributos correspondientes.
	// La matrícula funciona como identificador del transporte.
	public void agregarTrailer(String matricula, double cargaMax, double capacidad, boolean tieneRefrigeracion,
			double costoKm, double segCarga) {
		TrailerComun trailer = new TrailerComun(transportes.size() + 1, cargaMax, capacidad, tieneRefrigeracion,
				costoKm, segCarga);
		transportes.put(matricula, trailer);
	};

	public void agregarMegaTrailer(String matricula, double cargaMax, double capacidad, boolean tieneRefrigeracion,
			double costoKm, double segCarga, double costoFijo, double costoComida) {
		MegaTrailer megaTrailer = new MegaTrailer(transportes.size() + 1, cargaMax, capacidad, tieneRefrigeracion,
				costoKm, segCarga, costoFijo, costoComida);
		transportes.put(matricula, megaTrailer);
	};

	public void agregarFlete(String matricula, double cargaMax, double capacidad, double costoKm, int cantAcompaniantes,
			double costoPorAcompaniante) {
		Flete flete = new Flete(transportes.size() + 1, cargaMax, capacidad, costoKm, cantAcompaniantes,
				costoPorAcompaniante);
		transportes.put(matricula, flete);
	};

	// Se asigna un destino a un transporte dada su matrícula (el destino
	// debe haber sido agregado previamente, con el método agregarDestino).
	// Si el destino no está registrado, se debe generar una excepción.
	public void asignarDestino(String matricula, String destino) {

		if (!existeDestino(destino))
			throw new RuntimeException("El destino no existe");

		if (existeVehiculo(matricula) && !vehiculoTieneViajeAsignado(matricula)
				&& corroborarSiPuedeRealizarViajeXKM(matricula, destino))

			transportes.get(matricula).setViaje(obtenerViaje(destino));

	};

	// Se incorpora un paquete a algún depósito de la empresa.
	// Devuelve verdadero si se pudo incorporar, es decir,
	// si el depósito acorde al paquete tiene suficiente espacio disponible.
	public boolean incorporarPaquete(String destino, double peso, double volumen, boolean necesitaRefrigeracion) {
		Paquete paquete = new Paquete(destino, peso, volumen, necesitaRefrigeracion);

		if (necesitaRefrigeracion && paquete.getVolumen()<=capDepositoFrio) {
			capDepositoFrio-=paquete.getVolumen();
			return depositoFrio.add(paquete);
		}
		else if (!necesitaRefrigeracion && paquete.getVolumen() <= capDepositoComun) {	
			capDepositoComun-=paquete.getVolumen();
			return depositoComun.add(paquete);
		}
		
		return false;
	};

	// Dado un ID de un transporte se pide cargarlo con toda la mercadería
	// posible, de acuerdo al destino del transporte. No se debe permitir
	// la carga si está en viaje o si no tiene asignado un destino.
	// Utilizar el depósito acorde para cargarlo.
	// Devuelve un double con el volumen de los paquetes subidos
	// al transporte.
	public double cargarTransporte(String matricula) {
		Transporte transporte;
		
		if(transportes.get(matricula) instanceof TrailerComun) {
			transporte = (TrailerComun) transportes.get(matricula);			
		}
		
		else if(transportes.get(matricula) instanceof MegaTrailer) {
			transporte = (MegaTrailer) transportes.get(matricula);
		}
		
		else {
			transporte = (Flete) transportes.get(matricula);
		}
			
			
		double volumenCargado=0;
		if (transporte.tieneViajeAsignado() && !transporte.getViaje().isEnViaje()) {
			//Carga si es trailer comun o mega trailer
			if(transportes.get(matricula) instanceof TrailerComun || transportes.get(matricula) instanceof MegaTrailer) {
				if(depositoFrio.size()>0 && transporte.isEquipoDeRefrigeracion()==true) {
//					for(Paquete p: depositoFrio) {
//						if(p.getDestino().equals(transporte.viaje.getDestino())) {
//							transporte.cargarTransporte(p);
//							depositoFrio.remove(p);
//							volumenCargado+=p.getVolumen();
//						}
//					}
					Iterator<Paquete> iterador= depositoFrio.iterator();
				    while(iterador.hasNext()) {
				    	Paquete paquete= iterador.next();
				    	if(paquete.getDestino().equals(transporte.getViaje().getDestino())) {	
				    		transporte.cargarTransporte(paquete);
				    		volumenCargado+=paquete.getVolumen();
				    		iterador.remove();				    		
				    	}	    	
				    }
				}else if(depositoComun.size()>0 && transporte.isEquipoDeRefrigeracion()==false){
//					for(Paquete p: depositoComun) {
//						if(p.getDestino().equals(transporte.viaje.getDestino())) {
//							transporte.cargarTransporte(p);
//							depositoComun.remove(p);
//							volumenCargado+=p.getVolumen();
//						}
//					}
					Iterator<Paquete> iterador= depositoComun.iterator();
				    while(iterador.hasNext()) {
				    	Paquete paquete= iterador.next();
				    	if(paquete.getDestino().equals(transporte.getViaje().getDestino())) {	
				    		transporte.cargarTransporte(paquete);
				    		volumenCargado+=paquete.getVolumen();
				    		iterador.remove();				    		
				    	}	    	
				    }
				}
			}
			
			//Carga flete por defecto
			else if(transportes.get(matricula) instanceof Flete) {	
				if(depositoComun.size()>0) {
//					for(Paquete p: depositoComun) {
//						if(p.getDestino().equals(transporte.viaje.getDestino())) {
//							transporte.cargarTransporte(p);
//							System.out.println(p.getDestino());
//							depositoComun.remove(p);
//							volumenCargado+=p.getVolumen();
//						}
//					}	
					Iterator<Paquete> iterador= depositoComun.iterator();
				    while(iterador.hasNext()) {
				    	Paquete paquete= iterador.next();
				    	if(paquete.getDestino().equals(transporte.getViaje().getDestino())) {	
				    		transporte.cargarTransporte(paquete);
				    		volumenCargado+=paquete.getVolumen();
				    		iterador.remove();
				    	}	    	
				    }
				}
			}
		}

		return volumenCargado;
	};

	// Inicia el viaje del transporte identificado por la
	// matrícula pasada por parámetro.
	// En caso de no tener mercadería cargada o de ya estar en viaje
	// se genera una excepción.
	public void iniciarViaje(String matricula) {
		Transporte transporte = transportes.get(matricula);
		transporte.iniciarViaje();
	};

	// Finaliza el viaje del transporte identificado por la
	// matrícula pasada por parámetro.
	// El transporte vacía su carga y blanquea su destino, para poder
	// ser vuelto a utilizar en otro viaje.
	// Genera excepción si no está actualmente en viaje.
	public void finalizarViaje(String matricula) {
		Transporte transporte = transportes.get(matricula);
		transporte.finalizarViaje();
	};

	// Obtiene el costo de viaje del transporte identificado por la
	// matrícula pasada por parámetro.
	// Genera Excepción si el transporte no está en viaje.
	public double obtenerCostoViaje(String matricula) {
		return transportes.get(matricula).calcularCostoViaje();
	};

	// Busca si hay algún transporte igual en tipo, destino y carga.
	// En caso de que no se encuentre ninguno, se debe devolver null.
	public String obtenerTransporteIgual(String matricula) {

//		Transporte transporte = transportes.get(matricula);
		Transporte transporte;
		
		if(transportes.get(matricula) instanceof TrailerComun) {
			transporte = (TrailerComun) transportes.get(matricula);			
		}
		
		else if(transportes.get(matricula) instanceof MegaTrailer) {
			transporte = (MegaTrailer) transportes.get(matricula);
		}
		
		else {
			transporte = (Flete) transportes.get(matricula);
		}

		for (HashMap.Entry<String, Transporte> entry : transportes.entrySet()) {
			if (entry.getValue().equals(transporte) && !matricula.equals(entry.getKey())) {	
				System.out.println("EMI");
				System.out.println(entry.getKey());
					
				return entry.getKey();

			}
		}

		return null;
	};

	public Boolean existeDestino(String destino) {
		for (Viaje v : destinos) {
			System.out.println(v.getDestino());
			if(v.getDestino().equals(destino)) {
				return true;
			}; 
		}
		return false;
	}

	public Viaje obtenerViaje(String destino) {

		for (Viaje busqueda : destinos) {
			if (busqueda.getDestino().equals(destino)) {
				return busqueda;
			}
		}

		return null;
	}

	public int obtenerDistanciaViaje(String destino) {

		for (Viaje busqueda : destinos) {
			if (busqueda.getDestino().equals(destino)) {
				return (int) busqueda.getDistanciaEnKm();
			}
		}
		return 0;

	}

	public boolean existeVehiculo(String matricula) {

		if (transportes.containsKey(matricula))
			return true;

		return false;

	}

	public boolean vehiculoTieneViajeAsignado(String matricula) {

		return transportes.get(matricula).tieneViajeAsignado();

	}

	public boolean corroborarSiPuedeRealizarViajeXKM(String matricula, String destino) {

		// Si es un trailer comun no puede ser un viaje de mas de 500km
		if ((transportes.get(matricula) instanceof TrailerComun) && (obtenerDistanciaViaje(destino) < 500)) {
			return true;
			// Si es un trailer mega debe ser un viaje de mas de 500km
		} else if ((transportes.get(matricula) instanceof MegaTrailer) && (obtenerDistanciaViaje(destino) > 500)) {
			return true;
		} else if (transportes.get(matricula) instanceof Flete) {

			return true;
		}

		return false;
	}

}
