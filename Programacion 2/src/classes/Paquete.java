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
	public boolean equals (Object OtroPaquete) {
		
		if (OtroPaquete==null)
		return false;
		
		if (!(this.getClass() == OtroPaquete.getClass()))
			return false;
		
		Paquete p = (Paquete) OtroPaquete;
		
		return  ( this.getDestino().equals(p.getDestino()) ) &&
			     ( this.getPeso() == p.getPeso() ) &&
			     ( this.getVolumen()== p.getVolumen() ) &&
	 		     ( this.getNecesitaFrio() == p.getNecesitaFrio() ) ;
		
	}
	
}
