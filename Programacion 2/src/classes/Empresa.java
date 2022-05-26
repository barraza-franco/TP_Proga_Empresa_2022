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
	// Si ya existe el destino se debe generar una excepci�n.
	public void agregarDestino(String destino, int km) {
		Viaje viaje = new Viaje(destino, km);
		
		if (!existeDestino(destino))
			destinos.add(viaje);
		else
			throw new RuntimeException("El destino ya existe");
		
	};

	// Los siguientes m�todos agregan los tres tipos de transportes a la
	// empresa, cada uno con sus atributos correspondientes.
	// La matr�cula funciona como identificador del transporte.
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

	// Se asigna un destino a un transporte dada su matr�cula (el destino
	// debe haber sido agregado previamente, con el m�todo agregarDestino).
	// Si el destino no est� registrado, se debe generar una excepci�n.
	public void asignarDestino(String matricula, String destino) {
//		if(destinos.contains(destino)) {
//			Transporte transporte = transportes.get(matricula);
//			transporte.setViaje(destinos.);
//		}
		
		if (!existeDestino(destino)) 
			throw new RuntimeException("El destino no existe");
		
		if (existeVehiculo(matricula)) {
			
		}
		
		
		
	};

	// Se incorpora un paquete a alg�n dep�sito de la empresa.
	// Devuelve verdadero si se pudo incorporar, es decir,
	// si el dep�sito acorde al paquete tiene suficiente espacio disponible.
	public boolean incorporarPaquete(String destino, double peso, double volumen, boolean necesitaRefrigeracion) {
		return true;
	};

	// Dado un ID de un transporte se pide cargarlo con toda la mercader�a
	// posible, de acuerdo al destino del transporte. No se debe permitir
	// la carga si est� en viaje o si no tiene asignado un destino.
	// Utilizar el dep�sito acorde para cargarlo.
	// Devuelve un double con el volumen de los paquetes subidos
	// al transporte.
	public double cargarTransporte(String matricula) {
		return -1;
	};

	// Inicia el viaje del transporte identificado por la
	// matr�cula pasada por par�metro.
	// En caso de no tener mercader�a cargada o de ya estar en viaje
	// se genera una excepci�n.
	public void iniciarViaje(String matricula) {
		Transporte transporte = transportes.get(matricula);
		transporte.iniciarViaje();
	};

	// Finaliza el viaje del transporte identificado por la
	// matr�cula pasada por par�metro.
	// El transporte vac�a su carga y blanquea su destino, para poder
	// ser vuelto a utilizar en otro viaje.
	// Genera excepci�n si no est� actualmente en viaje.
	public void finalizarViaje(String matricula) {

	};

	// Obtiene el costo de viaje del transporte identificado por la
	// matr�cula pasada por par�metro.
	// Genera Excepci�n si el transporte no est� en viaje.
	public double obtenerCostoViaje(String matricula) {
		return -1;
	};

	// Busca si hay alg�n transporte igual en tipo, destino y carga.
	// En caso de que no se encuentre ninguno, se debe devolver null.
	public String obtenerTransporteIgual(String matricula) {
		return "";
	};
	
	public Boolean existeDestino (String destino)
	{
		for (Viaje listaDestinos: destinos)
		{
			if(listaDestinos.getDestino().equals(destino)) 
			{
				return true;
				
			}
			
		}
		
		return false;
	}
	
	public boolean existeVehiculo(String matricula) {
		
		if (transportes.containsKey(matricula))
			return true;
		
		return false;

		
	}
	
	public boolean vehiculoTieneViajeAsignado (String matricula) {
		
		transportes.get(matricula).
	}
}
