package unlam.paradigmas.diagnostico;

import static org.junit.Assert.*;

import org.junit.Test;

public class Diagnostico03TEST {

	@SuppressWarnings("deprecation")
	@Test
	public void mostrarMatriz() {
		int matriz[][] = { { 2, 0, 1 }, { 2, 2, 6 }, { 7, 8, 4 } };
		int matrizResultado[][] = {{4,5,7},{13,18,13},{17,21,18}};
		
		//int matrizGrande[][] = new int[33_000][33_000];
		
		
		System.out.println("Original");
		Ejercicio03.mostrarMatriz(matriz);


		System.out.println("nueva");
		Ejercicio03.mostrarMatriz(Ejercicio03.resolver2(matriz));
		assertEquals(Ejercicio03.resolver2(matriz) ,matrizResultado);
		System.out.println("Original");
		Ejercicio03.mostrarMatriz(matriz);
	}

}
