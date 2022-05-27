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

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}

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
		
	}

	public double getCostoXKmViaje() {
		return costoXKmViaje;
	};
	
	@Override
	public boolean equals (Object vehiculo) {

		if (vehiculo == null)
			return false;
		
		//if(!(vehiculo instanceof TrailerComun))
		//	return false;
		
		//if(!(vehiculo instanceof MegaTrailer))
		//	return false;
		
		//if(!(vehiculo instanceof Flete))
		//	return false;
		
		if (!(this.getClass() == vehiculo.getClass()))
			return false;
		
		Transporte transporte = (Transporte) vehiculo;
		
		return (this.viaje.getDestino()==transporte.viaje.getDestino()) &&
			   (this.getCargaMaxima() == transporte.getCargaMaxima()) &&
			   (this.getCapacidadMaxima() == transporte.getCapacidadMaxima()) &&
			   (this.getClass().getName().equals(transporte.getClass().getName()));

		
	}
	
}