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
	// Si ya existe el destino se debe generar una excepción.
	void agregarDestino(String destino, int km) {
		
	};
	
	// Los siguientes métodos agregan los tres tipos de transportes a la
	// empresa, cada uno con sus atributos correspondientes.
	// La matrícula funciona como identificador del transporte.
	void agregarTrailer(String matricula, double cargaMax, double capacidad, boolean tieneRefrigeracion, double costoKm, double segCarga) {
		
	};
	
	void agregarMegaTrailer(String matricula, double cargaMax, double capacidad, boolean tieneRefrigeracion, double costoKm, double segCarga, double costoFijo, double costoComida) {
		
	};
	
	void agregarFlete(String matricula, double cargaMax, double capacidad, double costoKm, int cantAcompaniantes, double costoPorAcompaniante) {
		
	};
	
	// Se asigna un destino a un transporte dada su matrícula (el destino
	// debe haber sido agregado previamente, con el método agregarDestino).
	// Si el destino no está registrado, se debe generar una excepción.
	void asignarDestino(String matricula, String destino) {
		
	};
	
	// Se incorpora un paquete a algún depósito de la empresa.
	// Devuelve verdadero si se pudo incorporar, es decir,
	// si el depósito acorde al paquete tiene suficiente espacio disponible.
	boolean incorporarPaquete(String destino, double peso, double volumen, boolean necesitaRefrigeracion) {
		return true;
	};
	
	// Dado un ID de un transporte se pide cargarlo con toda la mercadería
	// posible, de acuerdo al destino del transporte. No se debe permitir
	// la carga si está en viaje o si no tiene asignado un destino.
	// Utilizar el depósito acorde para cargarlo.
	// Devuelve un double con el volumen de los paquetes subidos
	// al transporte.
	double cargarTransporte(String matricula) {
		return -1;
	};
	
	// Inicia el viaje del transporte identificado por la
	// matrícula pasada por parámetro.
	// En caso de no tener mercadería cargada o de ya estar en viaje
	// se genera una excepción.
	void iniciarViaje(String matricula) {
		
	};
	
	// Finaliza el viaje del transporte identificado por la
	// matrícula pasada por parámetro.
	// El transporte vacía su carga y blanquea su destino, para poder
	// ser vuelto a utilizar en otro viaje.
	// Genera excepción si no está actualmente en viaje.
	void finalizarViaje(String matricula) {
		
	};
	
	// Obtiene el costo de viaje del transporte identificado por la
	// matrícula pasada por parámetro.
	// Genera Excepción si el transporte no está en viaje.
	double obtenerCostoViaje(String matricula) {
		return -1;
	};
	
	// Busca si hay algún transporte igual en tipo, destino y carga.
	// En caso de que no se encuentre ninguno, se debe devolver null.
	String obtenerTransporteIgual(String matricula) {
		return "";
	};
}
