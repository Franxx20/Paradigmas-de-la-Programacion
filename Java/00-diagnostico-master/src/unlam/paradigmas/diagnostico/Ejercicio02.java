
package unlam.paradigmas.diagnostico;

public class Ejercicio02 {

	public static boolean resolver(int[][] matriz) {
		if (matriz.length == 0 || matriz[0].length == 0) {
			return true;
		}
		boolean resultado = false;
		for (int i = 0; i < matriz.length && !resultado; i++) {
			for (int j = 0; j < matriz[i].length && !resultado; j++) {
				if (matriz[i][j] == 0)
					resultado = true;
			}
		}

		return resultado;
	}

	public static void mostrarMatriz(int[][] nueva) {
		int tamFila = nueva.length;
		int tamCol = nueva[0].length;

		for (int i = 0; i < nueva.length; i++) {

			for (int j = 0; j < nueva[i].length; j++) {
				System.out.print(nueva[i][j] + " ");

			}
			System.out.println("");
		}

	}
}
