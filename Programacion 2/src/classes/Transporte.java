package classes;

public abstract class Transporte {
	private int id;
	private int cargaMaxima;
	private int capacidadMaxima;
	private boolean equipoDeRefrigeracion;
	private float costoXKmViaje;
	private Viaje viaje;
	private boolean enViaje;
	private boolean viajeFinalizado;
	
	
	public Transporte(int id, int cargaMaxima, int capacidadMaxima, boolean equipoDeRefrigeracion, float costoXKmViaje,
	                  Viaje viaje, boolean enViaje, boolean viajeFinalizado)
					 {
						 this.id= id;
						 this.cargaMaxima=cargaMaxima;
						 this.capacidadMaxima=capacidadMaxima;
						 this.equipoDeRefrigeracion=equipoDeRefrigeracion;
						 this.costoXKmViaje=costoXKmViaje;
						 this.viaje=viaje;
						 this.enViaje=enViaje;
						 this.viajeFinalizado=viajeFinalizado;
					 }
					 
	
	abstract float calcularCostoViaje();
	
	private boolean iniciarViaje() {
		this.enViaje=true;
		this.viajeFinalizado=false;
	}
	
	private boolean finalizarViaje() {
		this.enViaje=false;
		this.viajeFinalizado=true;
	}
}