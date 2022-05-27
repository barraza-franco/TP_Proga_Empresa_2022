package classes;

public abstract class Transporte {
	private int id;
	private double cargaMaxima;
	private double capacidadMaxima;
	private double costoXKmViaje;
	protected Viaje viaje;
	
	Transporte(int id, double cargaMaxima, double capacidadMaxima, double costoXKmViaje) {
		this.id = id;
		this.cargaMaxima = cargaMaxima;
		this.capacidadMaxima = capacidadMaxima;
		this.costoXKmViaje = costoXKmViaje;
		this.viaje=null;
	}

	abstract float calcularCostoViaje();

	public void iniciarViaje() 
	{
		viaje.setEnViaje(true);
	};

	public void finalizarViaje() {
		viaje.setEnViaje(false);
		viaje.setViajeFinalizado(true);
	};
	
	public void setViaje(Viaje viaje){
		this.viaje = viaje;
	};
	
	public boolean tieneViajeAsignado() {
		
		if (this.viaje!=null)
			return true;
		
		return false;
		
	};
}