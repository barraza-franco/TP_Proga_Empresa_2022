package classes;

public class Flete extends Transporte {

	private int cantAcompaniantes;
	private double costoFijoPorAcompa�ante;
	private Viaje viaje;

	public Flete(int id, double cargaMaxima, double capacidadMaxima, double costoXKmViaje, int cantAcompaniantes, double costoFijoPorAcompa�ante) {
		super(id, cargaMaxima, capacidadMaxima, costoXKmViaje);
		this.cantAcompaniantes = cantAcompaniantes;
		this.costoFijoPorAcompa�ante = costoFijoPorAcompa�ante;
	}

	@Override
	float calcularCostoViaje() {
		// TODO Auto-generated method stub
		return (float) ((this.getCostoXKmViaje()*viaje.getDistanciaEnKm()) + (this.cantAcompaniantes*this.costoFijoPorAcompa�ante));
	}



}
