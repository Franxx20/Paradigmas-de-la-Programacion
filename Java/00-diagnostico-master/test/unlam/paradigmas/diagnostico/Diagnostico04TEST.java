package unlam.paradigmas.diagnostico;

import static org.junit.Assert.*;

import org.junit.Test;

public class Diagnostico04TEST {

	@Test
	public void test() {
		int[][] matriz = { { 1, 2, 3, 4 }, { 5, -6, -6, 20 }, { 1, 1, 10, 10 } };
		int [] res = {4,-6,10};
		assertArrayEquals(res, Ejercicio04.resolver(matriz));
		
		

		
		
	}

}
