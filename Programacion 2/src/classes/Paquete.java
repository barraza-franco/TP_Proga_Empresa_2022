package classes;

public class Paquete {
	private float volumen;
	private float peso;
	private String destino;
	private boolean necesitaFrio;
	
	public Paquete(float volumen, float peso, String destino, boolean necesitaFrio) {
		this.volumen = volumen;
		this.peso = peso;
		this.destino = destino;
		this.necesitaFrio = necesitaFrio;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getVolumen() {
		return volumen;
	}

	public float getPeso() {
		return peso;
	}

	public boolean getNecesitaFrio() {
		return necesitaFrio;
	}

	
}
