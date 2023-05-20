package clase_8_5_23;

public class Paquete {
	
	private double carga;
	private double volumen;
	private boolean esQuimico;
	
	public double getCarga() {
		return carga;
	}

	public double getVolumen() {
		return volumen;
	}

	public Paquete(double carga, double volumen, boolean esQuimico){
		this.carga = carga;
		this.volumen = volumen;
		this.esQuimico = esQuimico;
	}

	public boolean getEsQuimico() {
		return esQuimico;
	}
	
	

}
