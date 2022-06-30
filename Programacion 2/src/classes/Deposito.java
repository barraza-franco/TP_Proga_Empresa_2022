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
	
	void agregarPaquete(Paquete paquete){
		if(paquete.getVolumen()<=capDeposito) {
			capDeposito-=paquete.getVolumen();
			depositoPaquetes.add(paquete);
		}
	}
	
	Paquete getPaquete(){
		return depositoPaquetes.remove(0);
	}
	
	ArrayList getDepositoPaquetes(){
		return depositoPaquetes;
	}
}
