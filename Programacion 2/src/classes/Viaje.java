package classes;

public class Viaje {
	private String destino;
	private int distanciaEnKm;
	private boolean enViaje;
	private boolean viajeFinalizado;
	
	public Viaje(String destino, int distanciaEnKm)
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

	public int getDistanciaEnKm() {
		return distanciaEnKm;
	}

	public void setDistanciaEnKm(int distanciaEnKm) {
		this.distanciaEnKm = distanciaEnKm;
	}

	public boolean isEnViaje() {
		if(enViaje==true) {
			return enViaje;			
		}return false;
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
