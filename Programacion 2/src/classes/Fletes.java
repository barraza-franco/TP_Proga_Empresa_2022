package classes;

public class Fletes extends Transporte{

	private boolean acompa�ante;
	private float costoFijoPorAcompa�ante;
	
	public Fletes(int id, int cargaMaxima, int capacidadMaxima, boolean equipoDeRefrigeracion, float costoXKmViaje,
			Viaje viaje, boolean enViaje, boolean viajeFinalizado, boolean acompa�ante, float costoFijoPorAcompa�ante) {
		super(id, cargaMaxima, capacidadMaxima, equipoDeRefrigeracion, costoXKmViaje, viaje, enViaje, viajeFinalizado);
		// TODO Auto-generated constructor stub
		this.acompa�ante=acompa�ante;
		this.costoFijoPorAcompa�ante=costoFijoPorAcompa�ante;
	}

	@Override
	float calcularCostoViaje() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
