package circuloTest;

import unlam.paradigmas.objetos.ej03.Circulo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTEST {

	@Test(expected = Exception.class)
	public void radioMenorA1() throws Exception {
		@SuppressWarnings("unused")
		Circulo circulo = new Circulo(0);
	}

	@Test
	public void testObtenerRadio() throws Exception {
		Circulo circulo = new Circulo(3);
		assertEquals(3.0, circulo.obtenerRadio(), 0.001);
	}

	@Test(expected = Exception.class)
	public void testCambiarRadioA0() throws Exception {
		Circulo circuloNeg = new Circulo(5);
		circuloNeg.cambiarRadio(0);
	}

	@Test
	public void testCambiarRadioAPos() throws Exception {
		Circulo circulo = new Circulo(3);
		circulo.cambiarRadio(5);
		assertEquals(5.0, circulo.obtenerRadio(), 0.001);
	}

	@Test
	public void testObtenerDiametro() throws Exception {
		Circulo circulo = new Circulo(3);

		assertEquals(6.0, circulo.obtenerDiametro(), 0.001);
	}

	@Test(expected = Exception.class)
	public void testCambiarDiametroA0() throws Exception {
		Circulo circulo0 = new Circulo(4);
		circulo0.cambiarPerimetro(0);
	}

	@Test
	public void testCambiarDiametroAPos() throws Exception {
		Circulo circulo = new Circulo(4);
		circulo.cambiarDiametro(8);

		assertEquals(8.0, circulo.obtenerDiametro(), 0.001);
	}

	@Test
	public void testObtenerArea() throws Exception {
		Circulo circulo = new Circulo(3);
		assertEquals(Math.PI * 9, circulo.obtenerArea(), 0.001);

	}

	@Test()
	public void testCambiarAreaAPos() throws Exception {
		Circulo circulo = new Circulo(3);
		circulo.cambiarArea(Math.PI * 10);
		assertEquals(Math.PI * 10, circulo.obtenerArea(), 0.001);
	}

	@Test(expected = Exception.class)
	public void testCambiarAreaA0() throws Exception {
		Circulo circulo = new Circulo(3);
		circulo.cambiarArea(0);
	}

	@Test
	public void testObtenerPerimetro() throws Exception {
		Circulo circulo = new Circulo(3);
		assertEquals(2*Math.PI * 3, circulo.obtenerPerimetro(), 0.001);

	}

	@Test()
	public void testCambiarPerimetroAPos() throws Exception {
		Circulo circulo = new Circulo(3);
		circulo.cambiarPerimetro(9);
		assertEquals(9.0, circulo.obtenerPerimetro(), 0.001);
	}

	@Test(expected = Exception.class)
	public void testCambiarPerimetroA0() throws Exception {
		Circulo circulo = new Circulo(3);
		circulo.cambiarArea(0);
	}

}
