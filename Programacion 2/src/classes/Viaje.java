package classes;

public class Viaje {
	private String destino;
	private float distanciaEnKm;
	private boolean enViaje;
	private boolean viajeFinalizado;
	
	public Viaje(String destino, float distanciaEnKm)
	{
		this.destino=destino;
		this.distanciaEnKm=distanciaEnKm;
		this.enViaje=false;
		this.viajeFinalizado=false;
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

	public boolean isEnViaje() {
		return enViaje;
	}

	public void setEnViaje(boolean enViaje) {
		this.enViaje = enViaje;
	}

	public boolean isViajeFinalizado() {
		return viajeFinalizado;
	}

	public void setViajeFinalizado(boolean viajeFinalizado) {
		this.viajeFinalizado = viajeFinalizado;
	}
	
	
	
}
