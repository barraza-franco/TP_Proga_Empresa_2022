package classes;

public class MegaTrailer extends Transporte {

	private double gastoDeComida;
	private double seguroDeCarga;
	private double costoFijoPorViaje;
	private boolean equipoDeRefrigeracion;
	private Viaje viaje;

	public MegaTrailer(int id, double cargaMaxima, double capacidadMaxima, boolean equipoDeRefrigeracion, double costoXKmViaje, double gastoDeComida, double seguroDeCarga, double costoFijoPorViaje) {
		super(id, cargaMaxima, capacidadMaxima, costoXKmViaje);
		this.gastoDeComida = gastoDeComida;
		this.seguroDeCarga = seguroDeCarga;
		this.costoFijoPorViaje = costoFijoPorViaje;
		this.equipoDeRefrigeracion = equipoDeRefrigeracion;
	}

	@Override
	float calcularCostoViaje() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void iniciarViaje() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void finalizarViaje() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void setViaje(Viaje viaje) {
		// TODO Auto-generated method stub
		
	}

}
