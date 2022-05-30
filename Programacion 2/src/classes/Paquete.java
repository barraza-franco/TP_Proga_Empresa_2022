package classes;

public class Paquete {
	private String destino;
	private double peso;
	private double volumen;
	private boolean necesitaFrio;
	
	public Paquete(String destino,double peso, double volumen, boolean necesitaFrio) {
		this.destino = destino;
		this.peso = peso;
		this.volumen = volumen;
		this.necesitaFrio = necesitaFrio;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getVolumen() {
		return volumen;
	}

	public double getPeso() {
		return peso;
	}

	public boolean getNecesitaFrio() {
		return necesitaFrio;
	}
	
	//MODIFICAR
	@Override
	public boolean equals (Object vehiculo) {
		return true;
	}
	
}
