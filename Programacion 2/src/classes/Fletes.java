package classes;

public class Fletes extends Transporte{

	private boolean acompaņante;
	private float costoFijoPorAcompaņante;
	
	public Fletes(int id, int cargaMaxima, int capacidadMaxima, boolean equipoDeRefrigeracion, float costoXKmViaje,
			Viaje viaje, boolean enViaje, boolean viajeFinalizado, boolean acompaņante, float costoFijoPorAcompaņante) {
		super(id, cargaMaxima, capacidadMaxima, equipoDeRefrigeracion, costoXKmViaje, viaje, enViaje, viajeFinalizado);
		// TODO Auto-generated constructor stub
		this.acompaņante=acompaņante;
		this.costoFijoPorAcompaņante=costoFijoPorAcompaņante;
	}

	@Override
	float calcularCostoViaje() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
