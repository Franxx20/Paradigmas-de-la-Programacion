package unlam.paradigmas.diagnostico;

import static org.junit.Assert.*;

import java.util.concurrent.TimeoutException;

import org.junit.Test;

public class Diagnostico02TEST {

	// necesario para que la funcion sea testeable
	@Test
	public void matrizSin0() {
		boolean esperado = false;
		int matriz[][] = { { 2, 2, 1 }, { 2, 2, 6 }, { 7, 8, 4 } };

		boolean resultado = Ejercicio02.resolver(matriz);
		assertEquals("Errorrrr", resultado, esperado);

	}

	@Test
	public void matrizVacia() {

		int[][] matriz = {};
		boolean esperado = true;
		boolean real = Ejercicio02.resolver(matriz);
		assertEquals("Errorrrr", real, esperado);
	}

	// si el tiempo de ejecucion supera el establecido por timeout tirar un error
	@Test // (timeout = 10000)
	public void matrizGigante() {

		int[][] matriz = new int[10_000][52_424];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Integer.MAX_VALUE;

			}

		}

		matriz[9999][52423] = 0;
		boolean esperado = true;
		boolean real = Ejercicio02.resolver(matriz);
		assertEquals("Errorrrr", real, esperado);

	}

	@Test
	public void matrizCon0() {

		int matriz[][] = { { 2, 0, 1 }, { 2, 2, 6 }, { 7, 8, 4 } };

		assertEquals(Ejercicio02.resolver(matriz), true);
	}

}
