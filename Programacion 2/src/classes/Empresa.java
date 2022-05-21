package classes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Empresa {
	private String cuit;
	private String nombre;
	private ArrayList<Paquete> depositoFrio;
	private Array depositoFrio2;
	private ArrayList<Paquete> depositoComun;
	
	// Constructor de la empresa.
	Empresa(String cuit, String nombre, int capacidadDeCadaDeposito){
		this.cuit = cuit;
		this.nombre = nombre;
		this.depositoFrio2 = Array[capacidadDeCadaDeposito];
		this.depositoComun = new ArrayList<Paquete>();
	};
	
	// Incorpora un nuevo destino y su distancia en km.
	// Es requisito previo, para poder asignar un destino a un transporte.
	// Si ya existe el destino se debe generar una excepci�n.
	void agregarDestino(String destino, int km) {
		
	};
	
	// Los siguientes m�todos agregan los tres tipos de transportes a la
	// empresa, cada uno con sus atributos correspondientes.
	// La matr�cula funciona como identificador del transporte.
	void agregarTrailer(String matricula, double cargaMax, double capacidad, boolean tieneRefrigeracion, double costoKm, double segCarga) {
		
	};
	
	void agregarMegaTrailer(String matricula, double cargaMax, double capacidad, boolean tieneRefrigeracion, double costoKm, double segCarga, double costoFijo, double costoComida) {
		
	};
	
	void agregarFlete(String matricula, double cargaMax, double capacidad, double costoKm, int cantAcompaniantes, double costoPorAcompaniante) {
		
	};
	
	// Se asigna un destino a un transporte dada su matr�cula (el destino
	// debe haber sido agregado previamente, con el m�todo agregarDestino).
	// Si el destino no est� registrado, se debe generar una excepci�n.
	void asignarDestino(String matricula, String destino) {
		
	};
	
	// Se incorpora un paquete a alg�n dep�sito de la empresa.
	// Devuelve verdadero si se pudo incorporar, es decir,
	// si el dep�sito acorde al paquete tiene suficiente espacio disponible.
	boolean incorporarPaquete(String destino, double peso, double volumen, boolean necesitaRefrigeracion) {
		return true;
	};
	
	// Dado un ID de un transporte se pide cargarlo con toda la mercader�a
	// posible, de acuerdo al destino del transporte. No se debe permitir
	// la carga si est� en viaje o si no tiene asignado un destino.
	// Utilizar el dep�sito acorde para cargarlo.
	// Devuelve un double con el volumen de los paquetes subidos
	// al transporte.
	double cargarTransporte(String matricula) {
		return -1;
	};
	
	// Inicia el viaje del transporte identificado por la
	// matr�cula pasada por par�metro.
	// En caso de no tener mercader�a cargada o de ya estar en viaje
	// se genera una excepci�n.
	void iniciarViaje(String matricula) {
		
	};
	
	// Finaliza el viaje del transporte identificado por la
	// matr�cula pasada por par�metro.
	// El transporte vac�a su carga y blanquea su destino, para poder
	// ser vuelto a utilizar en otro viaje.
	// Genera excepci�n si no est� actualmente en viaje.
	void finalizarViaje(String matricula) {
		
	};
	
	// Obtiene el costo de viaje del transporte identificado por la
	// matr�cula pasada por par�metro.
	// Genera Excepci�n si el transporte no est� en viaje.
	double obtenerCostoViaje(String matricula) {
		return -1;
	};
	
	// Busca si hay alg�n transporte igual en tipo, destino y carga.
	// En caso de que no se encuentre ninguno, se debe devolver null.
	String obtenerTransporteIgual(String matricula) {
		return "";
	};
}
