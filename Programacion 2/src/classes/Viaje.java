package classes;

public class Viaje {
	private String destino;
	private int distanciaEnKm;
	private boolean enViaje;
	private boolean viajeFinalizado;

	public Viaje(String destino, int distanciaEnKm) {
		this.destino = destino;
		this.distanciaEnKm = distanciaEnKm;
		this.enViaje = false;
		this.viajeFinalizado = false;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getDistanciaEnKm() {
		return distanciaEnKm;
	}

	public void setDistanciaEnKm(int distanciaEnKm) {
		this.distanciaEnKm = distanciaEnKm;
	}

	public boolean isEnViaje() {
		if (enViaje == true) {
			return enViaje;
		}
		return false;
	}

	public void setEnViaje() {
		if (this.enViaje == false && this.viajeFinalizado == false)
			this.enViaje = true;
		else
			throw new RuntimeException("El viaje ya esta iniciado");
	}

	public boolean isViajeFinalizado() {
		return viajeFinalizado;
	}

	public void setViajeFinalizado() {
		if (this.viajeFinalizado == false) {
			this.enViaje = false;
			this.viajeFinalizado = true;
		} else
			throw new RuntimeException("El viaje ya esta finalizado");
	}

}
