package classes;

public class Flete extends Transporte {

	private int cantAcompaniantes;
	private double costoFijoPorAcompaniante;

	public Flete(int id, double cargaMaxima, double capacidadMaxima, double costoXKmViaje, int cantAcompaniantes, double costoFijoPorAcompaniante) {
		super(id, cargaMaxima, capacidadMaxima, costoXKmViaje);
		this.cantAcompaniantes = cantAcompaniantes;
		this.costoFijoPorAcompaniante = costoFijoPorAcompaniante;
	}

	@Override
	double calcularCostoViaje() {
		// TODO Auto-generated method stub
		return ((this.getCostoXKmViaje()*this.getViaje().getDistanciaEnKm()) + (this.cantAcompaniantes*this.costoFijoPorAcompaniante));
	}
	
	public boolean isEquipoDeRefrigeracion() {
		return false;
	}

	@Override
	boolean puedeRealizarViaje(int km) {
		return true;
	}



}
