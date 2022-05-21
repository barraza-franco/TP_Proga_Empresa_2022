package classes;

public class Fletes extends Transporte{

	private boolean acompañante;
	private float costoFijoPorAcompañante;
	
	public Fletes(int id, int cargaMaxima, int capacidadMaxima, boolean equipoDeRefrigeracion, float costoXKmViaje,
			Viaje viaje, boolean enViaje, boolean viajeFinalizado, boolean acompañante, float costoFijoPorAcompañante) {
		super(id, cargaMaxima, capacidadMaxima, equipoDeRefrigeracion, costoXKmViaje, viaje, enViaje, viajeFinalizado);
		// TODO Auto-generated constructor stub
		this.acompañante=acompañante;
		this.costoFijoPorAcompañante=costoFijoPorAcompañante;
	}

	@Override
	float calcularCostoViaje() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
