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
}
