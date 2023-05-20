package clase_8_5_23;

public class Camion {

	private int cantPaquetes = Integer.MAX_VALUE;
	private double cargaMax = 1500;
	private double volumenMax = 2000;
	private double distanciaMax = 20;
	
	/*
	private double acumCarga = cargaMax;
	private double acumVol = volumenMax;
	private double acumDist = distanciaMax;
	 */

	public boolean puedoLlevar(Paquete pa, int distancia) {

		if (pa.getCarga() <= cargaMax && pa.getVolumen() <= volumenMax 
				&& distancia <= distanciaMax && pa.getEsQuimico() == false) {
			cargaMax -= pa.getCarga();
			volumenMax -= pa.getVolumen();
			return true;
		}
		
		/*
		 if (pa.getCarga() <= acumCarga && pa.getVolumen() <= acumVol 
				&& distancia <= acumDist && pa.getEsQuimico() == false) {
			acumCarga -= pa.getCarga();
			acumVol -= pa.getVolumen();
			return true;
		}
		 */
		return false;

	}
}
