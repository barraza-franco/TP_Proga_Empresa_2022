package classes;

public class MegaTrailer extends Transporte {

	private double gastoDeComida;
	private double seguroDeCarga;
	private double costoFijoPorViaje;
	private boolean equipoDeRefrigeracion;

	public MegaTrailer(int id, double cargaMaxima, double capacidadMaxima, boolean equipoDeRefrigeracion,
			double costoXKmViaje, double gastoDeComida, double seguroDeCarga, double costoFijoPorViaje) {
		super(id, cargaMaxima, capacidadMaxima, costoXKmViaje);
		this.gastoDeComida = gastoDeComida;
		this.seguroDeCarga = seguroDeCarga;
		this.costoFijoPorViaje = costoFijoPorViaje;
		this.equipoDeRefrigeracion = equipoDeRefrigeracion;
	}

	@Override
	double calcularCostoViaje() {
		// TODO Auto-generated method stub
		return ((this.getCostoXKmViaje() * this.getViaje().getDistanciaEnKm()) + gastoDeComida + seguroDeCarga
				+ costoFijoPorViaje);
	}

	public boolean isEquipoDeRefrigeracion() {
		return equipoDeRefrigeracion;
	}

	@Override
	boolean puedeRealizarViaje(int km) {
		return km>500;
	}
}
