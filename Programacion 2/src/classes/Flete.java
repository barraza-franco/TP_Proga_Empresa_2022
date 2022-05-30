package classes;

public class Flete extends Transporte {

	private int cantAcompaniantes;
	private double costoFijoPorAcompaņante;

	public Flete(int id, double cargaMaxima, double capacidadMaxima, double costoXKmViaje, int cantAcompaniantes, double costoFijoPorAcompaņante) {
		super(id, cargaMaxima, capacidadMaxima, costoXKmViaje);
		this.cantAcompaniantes = cantAcompaniantes;
		this.costoFijoPorAcompaņante = costoFijoPorAcompaņante;
	}

	@Override
	double calcularCostoViaje() {
		// TODO Auto-generated method stub
		return ((this.getCostoXKmViaje()*this.getViaje().getDistanciaEnKm()) + (this.cantAcompaniantes*this.costoFijoPorAcompaņante));
	}

	@Override
	boolean isEquipoDeRefrigeracion() {
		return false;
	}



}
