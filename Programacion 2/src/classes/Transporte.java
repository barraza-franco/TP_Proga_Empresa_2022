package classes;

public abstract class Transporte {
	private int id;
	private double cargaMaxima;
	private double capacidadMaxima;
	private double costoXKmViaje;
	
	Transporte(int id, double cargaMaxima, double capacidadMaxima, double costoXKmViaje) {
		this.id = id;
		this.cargaMaxima = cargaMaxima;
		this.capacidadMaxima = capacidadMaxima;
		this.costoXKmViaje = costoXKmViaje;
	}

	abstract float calcularCostoViaje();

	abstract void iniciarViaje();

	abstract void finalizarViaje();
	
	abstract void setViaje(Viaje viaje);
}