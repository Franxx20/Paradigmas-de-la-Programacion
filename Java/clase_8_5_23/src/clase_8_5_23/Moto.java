package clase_8_5_23;

public class Moto {
	
	private int cantPaquetes = 6;
	private double cargaMax = 30;
	private double volumenMax = 100;
	private double distanciaMax = 5;
	
	/*
	private int acumPaq = cantPaquetes
	private double acumCarga = cargaMax;
	private double acumVol = volumenMax;
	 */

	public boolean puedoLlevar(Paquete pa, int distancia){
		
		if(cantPaquetes != 0){
			if(pa.getCarga() <= cargaMax && pa.getVolumen() <= volumenMax && distancia <= distanciaMax){
				cargaMax -= pa.getCarga();
				volumenMax -= pa.getVolumen();
				this.cantPaquetes--;
				return true;
			}
		}
		
		/*
		 	if(acumPaq != 0){
			if (pa.getCarga() <= acumCarga && pa.getVolumen() <= acumVol 
				&& distancia <= acumDist) {
			acumCarga -= pa.getCarga();
			acumVol -= pa.getVolumen();
			return true;
		}
		}
		 */
		return false;
		
	}
}
