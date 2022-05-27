package classes;

public class Flete extends Transporte {

	private int cantAcompaniantes;
	private double costoFijoPorAcompaņante;
	private Viaje viaje;

	public Flete(int id, double cargaMaxima, double capacidadMaxima, double costoXKmViaje, int cantAcompaniantes, double costoFijoPorAcompaņante) {
		super(id, cargaMaxima, capacidadMaxima, costoXKmViaje);
		this.cantAcompaniantes = cantAcompaniantes;
		this.costoFijoPorAcompaņante = costoFijoPorAcompaņante;
	}

	@Override
	float calcularCostoViaje() {
		// TODO Auto-generated method stub
		return (float) ((this.getCostoXKmViaje()*viaje.getDistanciaEnKm()) + (this.cantAcompaniantes*this.costoFijoPorAcompaņante));
	}



}
