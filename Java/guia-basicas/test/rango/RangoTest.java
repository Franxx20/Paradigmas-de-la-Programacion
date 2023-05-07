package rango;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.unlam.paradigmas.basicas.ej01.Rango;

public class RangoTest {

	@Test(expected = Exception.class)
	public void testExceptionDivCero() throws Exception {
		@SuppressWarnings("unused")
		Rango r = Rango.intervaloAbierto(1, 0);

	}

	@Test()
	public void testNumeroEnRango() throws Exception {
		Rango r = Rango.intervaloAbierto(1, 3);
		assertTrue(r.numeroEnRango(2.99));
	}

	@Test()
	public void testNumeroNoEnRango() throws Exception {
		Rango r = Rango.intervaloAbierto(1, 3);
		assertFalse(r.numeroEnRango(3));
	}

	@Test
	public void testRangoEnRangoSup() throws Exception {
		Rango r1 = Rango.intervaloCerrado(1, 3);
		Rango r2 = Rango.intervaloAbierto(1, 3);

		assertTrue(r1.rangoEnRango(r2));
	}

	@Test
	public void testRangoNoEnRango() throws Exception {
		Rango r1 = Rango.intervaloAbierto(1, 3);
		Rango r2 = Rango.intervaloCerrado(1, 3);

		assertFalse(r1.rangoEnRango(r2));
	}

	@Test
	public void testSeIntersectan() throws Exception
	/*
	 * Sabiendo que para intersectar dos rangos A y B. el maximo de A debe ser mayor
	 * al Minimo de B, y a su vez el máximo de B debe ser mayor al Minimo de A
	 */ {
		Rango r1 = Rango.intervaloAbierto(1, 3);
		Rango r2 = Rango.intervaloCerrado(2, 4);

		assertTrue(r2.seIntersectan(r1));

	}

	@Test
	public void testNoSeIntersectan() throws Exception
	/*
	 * Sabiendo que para intersectar dos rangos A y B. el maximo de A debe ser mayor
	 * al Minimo de B, y a su vez el máximo de B debe ser mayor al Minimo de A
	 */ {
		Rango r1 = Rango.intervaloAbierto(1, 2);
		Rango r2 = Rango.intervaloCerrado(3, 4);

		assertFalse(r2.seIntersectan(r1));

	}

	@Test
	public void testEqualsObject() throws Exception {
		Rango r1 = Rango.intervaloCerrado(1, 2);
		Rango r2 = Rango.intervaloCerrado(1, 2);

		assertTrue(r1.equals(r2));

	}

	@Test
	public void testCompareTo() {
		fail("Not yet implemented");
	}

	@Test
	public void testSumaRangos() throws Exception {
		Rango r1 = Rango.intervaloCerrado(-1, 2);
		Rango r2 = Rango.intervaloCerrado(1, 3);

		Rango r3 = Rango.intervaloCerrado(-1, 3);

		Rango r4 = r1.sumaRangos(r2);

		assertEquals(r3, r4);
	}

	@Test
	public void testInterseccionRangos() throws Exception{
		Rango r1 = Rango.intervaloAbierto(1, 3);
		Rango r2 = Rango.intervaloCerrado(2, 4);
		
		Rango r3 = r1.interseccionRangos(r2);
		
		Rango r4 = Rango.intervaloCerradoAbierto(2, 3);
		
		assertTrue(r3.equals(r4));
	}

	@Test
	public void testDesplazarRango() throws Exception{

		Rango r1 = Rango.intervaloCerrado(1, 1);
		Rango r2 = r1.desplazarRango(1);
		Rango r3 = Rango.intervaloCerrado(2, 2);

		assertTrue(r3.equals(r2));
		

	}

}
