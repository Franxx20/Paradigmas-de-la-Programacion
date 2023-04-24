package edu.unlam.paradigmas.entradasalida.ej03;

public class Cuadrilatero {
	Luchador[] luchadores;


	public Cuadrilatero(Luchador[] datos) {
		this.luchadores = datos;
	}


	public int[] calcularDominados() {
		int resultados[] = new int[luchadores.length];

		for (int i = 0; i < resultados.length; i++) {
			for (int j = 0; j < resultados.length; j++) {
				if (luchadores[i].dominaA(luchadores[j])) {
					resultados[i]++;
				}

			}

		}

		return resultados;
	}

}
