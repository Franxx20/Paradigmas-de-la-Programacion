package cubo;

import static org.junit.Assert.*;
import unlam.paradigmas.objetos.ej04.Cubo;

import org.junit.Test;

public class cuboTEST {

	@Test(expected = Exception.class)
	public void inicializandoLadoMenorAZero() throws Exception {
		@SuppressWarnings("unused")
		Cubo c = new Cubo(0);
	}

	@Test
	public void inicializandoLadoMayorAZero() throws Exception {
		@SuppressWarnings("unused")
		Cubo c = new Cubo(1);
	}

	@Test
	public void testObtenerLado() throws Exception {
		Cubo c = new Cubo(3);
		assertEquals(3.0, c.obtenerLado(), 0.001);

	}

	@Test(expected = Exception.class)
	public void testCambiarLadoAZero() throws Exception {
		Cubo c = new Cubo(3);
		c.cambiarLado(0);
	}

	@Test
	public void testCambiarLadoAPos() throws Exception {
		Cubo c = new Cubo(3);
		c.cambiarLado(5);
	}

	@Test
	public void testObtenerAreaCara() throws Exception {
		Cubo c = new Cubo(3);
		assertEquals(9.0, c.obtenerAreaCara(), 0.001);
	}

	@Test(expected = Exception.class)
	public void testCambiarAreaCaraCero() throws Exception {
		Cubo c = new Cubo(3);
		c.cambiarAreaCara(0);
	}

	@Test
	public void testCambiarAreaCaraPos() throws Exception {
		Cubo c = new Cubo(3);
		c.cambiarAreaCara(5);
		assertEquals(5.0, c.obtenerAreaCara(), 0.001);
	}

	@Test
	public void testObtenerVolumen() throws Exception {
		Cubo c = new Cubo(5);
		assertEquals(125.0, c.obtenerVolumen(), 0.001);
	}

	@Test(expected = Exception.class)
	public void testCambiarVolumenACero() throws Exception {
		Cubo c = new Cubo(2);
		c.cambiarVolumen(0);
	}

	@Test
	public void testCambiarVolumenAPos() throws Exception {
		Cubo c = new Cubo(3);
		c.cambiarVolumen(125);
		assertEquals(125.0, c.obtenerVolumen(), 0.001);

	}

}
