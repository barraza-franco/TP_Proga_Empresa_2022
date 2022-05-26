package classes;

public class TrailerComun extends Transporte {
	
	private double seguroDeCarga;
	private boolean equipoDeRefrigeracion;
	private Viaje viaje;

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
	
	@Override
	public void iniciarViaje() {
		if(!viaje.isEnViaje()) {
			viaje.setEnViaje(true);
			System.out.println("El viaje ha sido iniciado correctamente.");
		}
		System.out.println("El viaje no se pudo iniciar.");

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