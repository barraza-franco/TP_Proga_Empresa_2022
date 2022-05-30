package classes;

import java.util.HashSet;

public abstract class Transporte {
	private int id;
	private double cargaMaxima;
	private double capacidadMaxima;
	private double costoXKmViaje;
	private boolean equipoDeRefrigeracion;
	private Viaje viaje;
	private HashSet<Paquete> carga;
	
	Transporte(int id, double cargaMaxima, double capacidadMaxima, double costoXKmViaje) {
		this.id = id;
		this.cargaMaxima = cargaMaxima;
		this.capacidadMaxima = capacidadMaxima;
		this.costoXKmViaje = costoXKmViaje;
		this.viaje=null;
		this.equipoDeRefrigeracion=false;
		this.carga=new HashSet<Paquete>();
	}
	
	public Viaje getViaje() {
		return viaje;
	}

	public void cargarTransporte(Paquete paquete) {
		if(paquete.getPeso()<cargaMaxima && paquete.getVolumen()<capacidadMaxima) {
			carga.add(paquete);
			cargaMaxima-=paquete.getPeso();
			capacidadMaxima-=paquete.getVolumen();
		}
	};

	abstract double calcularCostoViaje();

	public void iniciarViaje() 
	{
		viaje.setEnViaje(true);
	};

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void finalizarViaje() {
		viaje.setEnViaje(false);
		viaje.setViajeFinalizado(true);
	};
	
	public void setViaje(Viaje viaje){
		this.viaje = viaje;
	};
	
	public boolean tieneViajeAsignado() {
		
		if (this.viaje!=null)
			return true;
		
		return false;
		
	}

	public double getCostoXKmViaje() {
		return costoXKmViaje;
	};
	
	abstract boolean isEquipoDeRefrigeracion() ;
	
	public HashSet<Paquete> getCarga() {
		return carga;
	}

	@Override
	public boolean equals (Object vehiculo) {

		if (vehiculo == null)
			return false;
		
		//if(!(vehiculo instanceof TrailerComun))
		//	return false;
		
		//if(!(vehiculo instanceof MegaTrailer))
		//	return false;
		
		//if(!(vehiculo instanceof Flete))
		//	return false;
		
//		if (!(this.getClass() == vehiculo.getClass()))
//			return false;
		
		Transporte transporte = (Transporte) vehiculo;
		System.out.println(this.viaje.getDestino().equals(transporte.viaje.getDestino()));
		System.out.println(this.getClass().getName().equals(transporte.getClass().getName()));

		boolean cargasIguales=false;
		
		int cont=0;
		for(Paquete p: carga) {
			for(Paquete p1: transporte.getCarga()) {
//				cargasIguales = cargasIguales || p.equals(p1);
				if(p.equals(p1)) {
					cont++;
				}
			}
		}
		cargasIguales = cont==carga.size();
		
		return (this.viaje.getDestino().equals(transporte.viaje.getDestino())) &&
			   (cargasIguales)&&
			   (this.getClass().getName().equals(transporte.getClass().getName()));

	}
	
}