package classes;

import java.util.HashMap;
import java.util.HashSet;

public class Empresa {
	private String cuit;
	private String nombre;
	private Paquete[] depositoFrio;
	private Paquete[] depositoComun;
	private HashSet<Viaje> destinos;
	private HashMap<String, Transporte> transportes;

	// Constructor de la empresa.
	public Empresa(String cuit, String nombre, int capacidadDeCadaDeposito) {
		this.cuit = cuit;
		this.nombre = nombre;
		this.depositoFrio = new Paquete[capacidadDeCadaDeposito];
		this.depositoComun = new Paquete[capacidadDeCadaDeposito];
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
	public void agregarTrailer(String matricula, double cargaMax, double capacidad, boolean tieneRefrigeracion, double costoKm, double segCarga) {
		TrailerComun trailer = new TrailerComun(transportes.size()+1 ,cargaMax, capacidad, tieneRefrigeracion, costoKm, segCarga);
		transportes.put(matricula, trailer);
	};

	public void agregarMegaTrailer(String matricula, double cargaMax, double capacidad, boolean tieneRefrigeracion, double costoKm, double segCarga, double costoFijo, double costoComida) {
		MegaTrailer megaTrailer = new MegaTrailer(transportes.size()+1 ,cargaMax, capacidad, tieneRefrigeracion, costoKm, segCarga, costoFijo, costoComida);
		transportes.put(matricula, megaTrailer);
	};

	public void agregarFlete(String matricula, double cargaMax, double capacidad, double costoKm, int cantAcompaniantes, double costoPorAcompaniante) {
		Flete flete = new Flete(transportes.size()+1 ,cargaMax, capacidad, costoKm, cantAcompaniantes, costoPorAcompaniante);
		transportes.put(matricula, flete);
	};

	// Se asigna un destino a un transporte dada su matrícula (el destino
	// debe haber sido agregado previamente, con el método agregarDestino).
	// Si el destino no está registrado, se debe generar una excepción.
	public void asignarDestino(String matricula, String destino) {
		
		if (!existeDestino(destino)) 
			throw new RuntimeException("El destino no existe");
		
		if (existeVehiculo(matricula) && !vehiculoTieneViajeAsignado(matricula)) {
			transportes.get(matricula).setViaje(obtenerViaje(destino));
		}
		
		
		
	};

	// Se incorpora un paquete a algún depósito de la empresa.
	// Devuelve verdadero si se pudo incorporar, es decir,
	// si el depósito acorde al paquete tiene suficiente espacio disponible.
	public boolean incorporarPaquete(String destino, double peso, double volumen, boolean necesitaRefrigeracion) {
		return true;
	};

	// Dado un ID de un transporte se pide cargarlo con toda la mercadería
	// posible, de acuerdo al destino del transporte. No se debe permitir
	// la carga si está en viaje o si no tiene asignado un destino.
	// Utilizar el depósito acorde para cargarlo.
	// Devuelve un double con el volumen de los paquetes subidos
	// al transporte.
	public double cargarTransporte(String matricula) {
		return -1;
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

	};

	// Obtiene el costo de viaje del transporte identificado por la
	// matrícula pasada por parámetro.
	// Genera Excepción si el transporte no está en viaje.
	public double obtenerCostoViaje(String matricula) {
		return -1;
	};

	// Busca si hay algún transporte igual en tipo, destino y carga.
	// En caso de que no se encuentre ninguno, se debe devolver null.
	public String obtenerTransporteIgual(String matricula) {
		return "";
	};
	
	public Boolean existeDestino (String destino)
	{
		for (Viaje listaDestinos: destinos)
		{
			if(listaDestinos.getDestino()==destino) 
			{
				return true;
				
			}
			
		}
		
		return false;
	}
	
	public Viaje obtenerViaje(String destino) {

		for (Viaje busqueda: destinos) {
			if (busqueda.getDestino()==destino) {
				return busqueda;
			}
		}
		
		return null;
	}
	
	public boolean existeVehiculo(String matricula) {
		
		if (transportes.containsKey(matricula))
			return true;
		
		return false;

		
	}
	
	public boolean vehiculoTieneViajeAsignado (String matricula) {
		
		return transportes.get(matricula).tieneViajeAsignado();
		
	}
}
