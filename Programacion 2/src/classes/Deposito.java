package classes;

import java.util.ArrayList;

public class Deposito {
	private int capDeposito;
	private ArrayList<Paquete> depositoPaquetes;
	private boolean tieneFrio;
	
	Deposito(int capDeposito, boolean tieneFrio){
		this.capDeposito = capDeposito;
		this.tieneFrio = tieneFrio;
		depositoPaquetes = new ArrayList<Paquete>();
	}
	
	boolean agregarPaquete(Paquete paquete){
		if(paquete.getVolumen()<=capDeposito) {
			capDeposito-=paquete.getVolumen();
			depositoPaquetes.add(paquete);
			return true;
		}
		return false;
	}
	
	void quitarPaquete(Paquete paquete){
		capDeposito+=paquete.getVolumen();
	}
	
	ArrayList<Paquete> getDepositoPaquetes(){
		return depositoPaquetes;
	}
}
