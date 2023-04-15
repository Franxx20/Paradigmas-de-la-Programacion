package notaTest;

import static org.junit.Assert.*;
import unlam.paradigmas.objetos.ej01.Nota;

import org.junit.Test;

public class NotaTest {

	@Test(expected = Exception.class)
	public void testFueraDeRango() throws Exception {
		@SuppressWarnings("unused")
		Nota nota = new Nota(-1);

	}

	@Test()
	public void testEnRango() throws Exception {
		Nota nota = new Nota(1);
		Nota nota1 = new Nota(10);
		Nota nota2 = new Nota(4);

	}

	@Test
	public void testObtenerValor() throws Exception {
		Nota nota = new Nota(1);
		assertEquals(1,nota.obtenerValor());

	}

	@Test
	public void testAprobado() throws Exception{
		Nota nota4 = new Nota(4);
		Nota nota10 = new Nota(10);
		assertTrue(nota4.aprobado());
		assertTrue(nota10.aprobado());
	}

	@Test
	public void testDesaprobado() throws Exception{
		Nota nota0 = new Nota(0);
		Nota nota3 = new Nota(3);
		Nota nota4 = new Nota(4);
		assertTrue(nota0.desaprobado());
		assertTrue(nota3.desaprobado());
		assertFalse(nota4.desaprobado());
	}

}
