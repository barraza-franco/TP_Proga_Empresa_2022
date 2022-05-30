package classes;

public class Flete extends Transporte {

	private int cantAcompaniantes;
	private double costoFijoPorAcompañante;

	public Flete(int id, double cargaMaxima, double capacidadMaxima, double costoXKmViaje, int cantAcompaniantes, double costoFijoPorAcompañante) {
		super(id, cargaMaxima, capacidadMaxima, costoXKmViaje);
		this.cantAcompaniantes = cantAcompaniantes;
		this.costoFijoPorAcompañante = costoFijoPorAcompañante;
	}

	@Override
	double calcularCostoViaje() {
		// TODO Auto-generated method stub
		return ((this.getCostoXKmViaje()*this.getViaje().getDistanciaEnKm()) + (this.cantAcompaniantes*this.costoFijoPorAcompañante));
	}

	@Override
	boolean isEquipoDeRefrigeracion() {
		return false;
	}



}
