package classes;

public class Flete extends Transporte {

	private int cantAcompaniantes;
	private double costoFijoPorAcompañante;
	private Viaje viaje;

	public Flete(int id, double cargaMaxima, double capacidadMaxima, double costoXKmViaje, int cantAcompaniantes, double costoFijoPorAcompañante) {
		super(id, cargaMaxima, capacidadMaxima, costoXKmViaje);
		this.cantAcompaniantes = cantAcompaniantes;
		this.costoFijoPorAcompañante = costoFijoPorAcompañante;
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
