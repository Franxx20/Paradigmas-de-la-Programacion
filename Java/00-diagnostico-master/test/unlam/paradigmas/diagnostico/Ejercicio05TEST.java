package unlam.paradigmas.diagnostico;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio05TEST {

	@Test
	public void test() {
		int[][] matriz = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
//		int res[][] = { { 13, 0, 0, 0 }, { 9, 14, 0, 0 }, { 5, 10, 15, 0 }, { 1, 6, 11, 16 }, { 2, 7, 12, 0 },
//				{ 3, 8, 0, 0 }, { 4, 0, 0, 0 } };
		int res[][] = { { 13 }, { 9, 14 }, { 5, 10, 15 }, { 1, 6, 11, 16 }, { 2, 7, 12 }, { 3, 8 }, { 4 } };

		System.out.println("Matriz original");
		Ejercicio05.mostrarMatriz(matriz);
		System.out.println("¨Matriz original");
		assertArrayEquals(res, Ejercicio05.resolver(matriz));
	}

}
