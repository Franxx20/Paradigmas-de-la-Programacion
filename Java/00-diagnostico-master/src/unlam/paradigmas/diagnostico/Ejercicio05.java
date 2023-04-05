package unlam.paradigmas.diagnostico;

public class Ejercicio05 {

	public static int[][] resolver(int[][] matriz) {
		// completar
		if (matriz.length == 0 || matriz[0].length == 0) {
			return null;
		}
		int triangulo[][] = new int[(matriz.length * 2) - 1][];

///// LLENADO DE MEMORIA
		int n = matriz.length;
		for (int w = 0; w < n; w++) {
			triangulo[w] = new int[w + 1];
		}

		for (int w = n; w < triangulo.length; w++) {
			triangulo[w] = new int[triangulo.length - w];
		}
///// FIN DE LLENADO DE MEMORIA

		// recorre las columnas
		for (int k = 0; k < matriz.length; k++) {
			int aux = 0;

			// recorre las filas desde abajo a la derecha hacia arriba
			for (int i = matriz.length - 1; i >= k; i--) {
				triangulo[aux + k][k] = matriz[i][k];
				aux++;

			}

			// recorre las columnas desde arriba a la izquierda hasta el fin de la derecha
			// abajo
			for (int j = 1 + k; j < matriz.length; j++) {
				triangulo[aux + k][k] = matriz[k][j];
				aux++;
			}
		}
		System.out.println("Termine!");
		Ejercicio05.mostrarMatriz(triangulo);

		return triangulo;
	}

	public static void mostrarMatriz(int[][] nueva) {

		for (int i = 0; i < nueva.length; i++) {

			for (int j = 0; j < nueva[i].length; j++) {
				System.out.print(nueva[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
