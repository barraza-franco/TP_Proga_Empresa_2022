package classes;

public class Flete extends Transporte {

	private int cantAcompaniantes;
	private double costoFijoPorAcompaņante;
	private Viaje viaje;

	public Flete(int id, double cargaMaxima, double capacidadMaxima, double costoXKmViaje, int cantAcompaniantes, double costoFijoPorAcompaņante) {
		super(id, cargaMaxima, capacidadMaxima, costoXKmViaje);
		this.cantAcompaniantes = cantAcompaniantes;
		this.costoFijoPorAcompaņante = costoFijoPorAcompaņante;
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
