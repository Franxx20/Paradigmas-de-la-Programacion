package unlam.paradigmas.diagnostico;

public class Ejercicio03 {

	public static int[][] resolver(int[][] matriz) {

		int tamFila = matriz.length;
		int tamCol = matriz[0].length;
		int nueva[][] = new int[tamFila + 2][tamCol + 2];
		int resultado[][] = new int[tamFila][tamCol];

		if (matriz.length == 0 || matriz[0].length == 0) {
			return null;
		}

		for (int i = 0; i < nueva.length; i++) {

			for (int j = 0; j < nueva[0].length; j++) {
				if (i > 0 && i <= tamFila && j > 0 && j <= tamCol) {
					nueva[i][j] = matriz[i - 1][j - 1];
				} else {
					nueva[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < tamFila; i++) {
			for (int j = 0; j < tamCol; j++) {
				resultado[i][j] = nueva[i + 1][j + 1 + 1] + nueva[i + 1][j + 1 - 1] + nueva[i + 1 + 1][j + 1]
						+ nueva[i + 1 - 1][j + 1] + nueva[i + 1][j + 1];
			}
		}

		return resultado;
	}

	public static int[][] resolver2(int[][] m) {
		if (m.length == 0 || m[0].length == 0) {
			return null;
		}

		int tamFila = m.length;
		int tamCol = m[0].length;
		int matriz[][] = new int[tamFila][tamCol];

		for (int i = 0; i < tamFila; i++) {
			for (int j = 0; j < tamCol; j++) {

				matriz[i][j] = m[i][j];

				if (i - 1 >= 0) {
					matriz[i][j] += m[i - 1][j];
				}

				if (i + 1 < tamFila) {
					matriz[i][j] += m[i + 1][j];
				}

				if (j - 1 >= 0) {
					matriz[i][j] += m[i][j - 1];
				}

				if (j + 1 < tamCol) {
					matriz[i][j] += m[i][j + 1];
				}
			}
		}

		return matriz;
	}

	public static void mostrarMatriz(int[][] nueva) {

		for (int i = 0; i < nueva.length; i++) {

			for (int j = 0; j < nueva[0].length; j++) {
				System.out.print(nueva[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
