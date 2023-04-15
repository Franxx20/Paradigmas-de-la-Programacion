package puntoTest;

import unlam.paradigmas.objetos.ej02.Punto;
import static org.junit.Assert.*;
import unlam.paradigmas.objetos.ej01.Nota;
import unlam.paradigmas.objetos.ej01.Nota;

import org.junit.Test;

public class PuntoTEST {

	@Test
	public void testObtenerX() {
		Punto punto = new Punto(1, 1);

		assertEquals(1.0, punto.obtenerX(), 0.001);
	}

	@Test
	public void testCambiarX() {
		Punto punto = new Punto(2, 3);
		punto.cambiarX(1.0);
		assertEquals(1.0, punto.obtenerX(), 0.001);

	}

	@Test
	public void testObtenerY() {
		Punto punto = new Punto(2, 3);
		assertEquals(3.0, punto.obtenerY(), 0.001);
	}

	@Test
	public void testCambiarY() {
		Punto punto = new Punto(2, 3);
		punto.cambiarY(1.0);
		assertEquals(1.0, punto.obtenerY(), 0.001);
	}

	@Test
	public void testEstaSobreEjeX() {
		Punto punto0x = new Punto(0, 3);
		Punto punto1x = new Punto(1, 3);
		assertTrue(punto0x.estaSobreEjeX());
		assertFalse(punto1x.estaSobreEjeX());

	}

	@Test
	public void testEstaSobreEjeY() {
		Punto punto0y = new Punto(3, 0);
		Punto punto1y = new Punto(3, 1);
		assertTrue(punto0y.estaSobreEjeY());
		assertFalse(punto1y.estaSobreEjeY());
	}

	@Test
	public void testEsElOrigen() {
		Punto punto00 = new Punto(0, 0);
		Punto punto11 = new Punto(1, 1);
		Punto punto01 = new Punto(0, 1);
		Punto punto10 = new Punto(1, 0);

		assertTrue(punto00.esElOrigen());
		assertFalse(punto11.esElOrigen());
		assertFalse(punto01.esElOrigen());
		assertFalse(punto10.esElOrigen());
	}

	@Test
	public void testDistanciaAlOrigen() {
		Punto punto00 = new Punto(0, 0);
		Punto punto11 = new Punto(1, 1);
		Punto punto01 = new Punto(0, 1);
		Punto punto10 = new Punto(1, 0);
		Punto punto33 = new Punto(3, 3);

		assertEquals(0.0, punto00.distanciaAlOrigen(), 0.001);
		assertEquals(Math.sqrt(2), punto11.distanciaAlOrigen(), 0.001);
		assertEquals(Math.sqrt(1), punto01.distanciaAlOrigen(), 0.001);
		assertEquals(Math.sqrt(1), punto10.distanciaAlOrigen(), 0.001);
		assertEquals(Math.sqrt(18), punto33.distanciaAlOrigen(), 0.001);

	}

	@Test
	public void testDistanciaAotroPunto() {
		Punto puntoA = new Punto(2, 3);
		Punto puntoB = new Punto(1, 4);

		assertEquals(Math.sqrt(2), puntoA.distanciaAotroPunto(puntoB), 0.001);
	}

}
