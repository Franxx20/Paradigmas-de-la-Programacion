package unlam.paradigmas.diagnostico;

import java.util.*;

public class Ejercicio04 {

	public static int[] resolver(int[][] matriz) {
		int[] moda = new int[matriz.length];

		if (matriz.length == 0 || matriz[0].length == 0) {
			return null;
		}

		int cant;
		int max = 0;
		int j = 0;
		int i = 0;
		int k = j + 1;
		int maxNum = 0;
		maxNum = matriz[0][0];

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[0].length; j++) {
				cant = 0;
				for (k = j + 1; k < matriz[0].length; k++) {
					if (matriz[i][j] == matriz[i][k]) {
						cant++;
					}

				}
				if (cant > max) {
					max = cant;
					maxNum = matriz[i][j];
				}
				else if (cant == max && maxNum< matriz[i][j])
				{
					maxNum = matriz[i][j];
				}

			}
			moda[i] = maxNum;

		}

		return moda;
	}
}
