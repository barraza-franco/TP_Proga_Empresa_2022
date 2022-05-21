package classes;

public class Viaje {
	private String destino;
	private float distanciaEnKm;
	
	public Viaje(String destino, float distanciaEnKm)
	{
		this.destino=destino;
		this.distanciaEnKm=destino;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getDistanciaEnKm() {
		return distanciaEnKm;
	}

	public void setDistanciaEnKm(float distanciaEnKm) {
		this.distanciaEnKm = distanciaEnKm;
	}
	
	
	
}
