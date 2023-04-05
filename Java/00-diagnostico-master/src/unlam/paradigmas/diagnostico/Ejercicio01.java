package unlam.paradigmas.diagnostico;

public class Ejercicio01 {




	public static boolean resolver(int[][] matriz) {
		int suma = matriz[0][0];
		for (int j = 1; j < matriz.length; j++) {
//			if (matriz[j][j] )
//				return false;
			if (suma != matriz[j][j])
				return false;
			suma += matriz[j][j];
		}

		return true;
	}
	
	public static void mostrarMatriz(int [][]nueva) {
		
		for (int i = 0; i < nueva.length; i++) {

			for (int j = 0; j < nueva[0].length; j++) {
				if (i > 0 && i < nueva.length && j > 0 && j < nueva[0].length) {
					System.out.print(nueva[i][j] + " ");

				} else {
					System.out.print(nueva[i][j] + " ");
				}

			}
			System.out.println("");
		}
		
	}
}
