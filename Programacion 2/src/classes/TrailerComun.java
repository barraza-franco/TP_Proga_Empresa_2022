package classes;

public class TrailerComun extends Transporte {
	
	private double seguroDeCarga;
	private boolean equipoDeRefrigeracion;

	public TrailerComun(int id, double cargaMaxima, double capacidadMaxima, boolean equipoDeRefrigeracion, double costoXKmViaje, double seguroDeCarga) {
		super(id, cargaMaxima, capacidadMaxima, costoXKmViaje);
		this.seguroDeCarga=seguroDeCarga;
		this.equipoDeRefrigeracion=equipoDeRefrigeracion;
	}

	@Override
	float calcularCostoViaje() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}