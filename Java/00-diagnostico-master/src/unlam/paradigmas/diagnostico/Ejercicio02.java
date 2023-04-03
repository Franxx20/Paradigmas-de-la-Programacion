
package unlam.paradigmas.diagnostico;

public class Ejercicio02 {



	public static boolean resolver(int[][] matriz) {
//		if (matriz.length == 0 || matriz[0].length == 0)
//			return true;
		if(matriz.length == 0 || matriz[0].length == 0) {
			return true;
		}
		boolean resultado = false;
		for (int i = 0; i < matriz.length && !resultado; i++) {
			for (int j = 0; j < matriz[i].length && !resultado; j++) {
				if (matriz[i][j] == 0)
					resultado= true;
			}
		}

		return resultado;
	}
}
