package classes;

public class Flete extends Transporte {

	private int cantAcompaniantes;
	private double costoFijoPorAcompa�ante;

	public Flete(int id, double cargaMaxima, double capacidadMaxima, double costoXKmViaje, int cantAcompaniantes, double costoFijoPorAcompa�ante) {
		super(id, cargaMaxima, capacidadMaxima, costoXKmViaje);
		this.cantAcompaniantes = cantAcompaniantes;
		this.costoFijoPorAcompa�ante = costoFijoPorAcompa�ante;
	}

	@Override
	double calcularCostoViaje() {
		// TODO Auto-generated method stub
		return ((this.getCostoXKmViaje()*this.getViaje().getDistanciaEnKm()) + (this.cantAcompaniantes*this.costoFijoPorAcompa�ante));
	}

	@Override
	boolean isEquipoDeRefrigeracion() {
		return false;
	}



}
