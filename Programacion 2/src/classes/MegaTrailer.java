package classes;

public class MegaTrailer extends Transporte{
	
	private float gastoDeComida;
	private float seguroDeCarga;
	private float costoFijoPorViaje;

	public MegaTrailer(int id, int cargaMaxima, int capacidadMaxima, boolean equipoDeRefrigeracion, float costoXKmViaje,
			Viaje viaje, boolean enViaje, boolean viajeFinalizado, float gastoDeComida, float seguroDeCarga, float costoFijoPorViaje) {
		super(id, cargaMaxima, capacidadMaxima, equipoDeRefrigeracion, costoXKmViaje, viaje, enViaje, viajeFinalizado);
		// TODO Auto-generated constructor stub
		this.gastoDeComida=gastoDeComida;
		this.seguroDeCarga=seguroDeCarga;
		this.costoFijoPorViaje=costoFijoPorViaje;
	}

	@Override
	float calcularCostoViaje() {
		// TODO Auto-generated method stub
		return 0;
	}

}
