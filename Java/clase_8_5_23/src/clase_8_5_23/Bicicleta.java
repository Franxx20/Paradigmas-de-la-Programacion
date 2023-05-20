package clase_8_5_23;

public class Bicicleta {
	
	private int cantPaquetes = 1;
	private double cargaMax = 10;
	private double volumenMax = 50;
	private double distanciaMax = 1;
	
	public Bicicleta(){
	}
	
	boolean puedoLlevar(Paquete pa, double distancia){
		return pa.getCarga() <= this.cargaMax && pa.getVolumen() <= this.volumenMax 
				&& distancia <= this.distanciaMax;
	}

}
