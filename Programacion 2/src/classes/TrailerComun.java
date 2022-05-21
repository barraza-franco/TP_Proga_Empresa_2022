package classes;

public class TrailerComun extends Transporte {
	
	private float seguroDeCarga;

	public TrailerComun(int id, int cargaMaxima, int capacidadMaxima, boolean equipoDeRefrigeracion,
			float costoXKmViaje, Viaje viaje, boolean enViaje, boolean viajeFinalizado, float seguroDeCarga) {
		super(id, cargaMaxima, capacidadMaxima, equipoDeRefrigeracion, costoXKmViaje, viaje, enViaje, viajeFinalizado);
		// TODO Auto-generated constructor stub
		this.seguroDeCarga=seguroDeCarga;
	}

	@Override
	float calcularCostoViaje() {
		// TODO Auto-generated method stub
		return 0;
	}

}
