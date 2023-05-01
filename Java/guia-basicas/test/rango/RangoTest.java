package rango;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.unlam.paradigmas.basicas.ej01.Rango;

public class RangoTest {

	@Test
	public void testHashCode() throws Exception {
		fail("Not yet implemented");
	}

	@Test
	public void testGetInferiorAbierto() throws Exception {
		Rango r = Rango.intervaloAbierto(1, 2);
		assertEquals(1.0 - Double.MIN_VALUE, r.getInferior(), 0);

	}
	@Test
	public void testGetInferiorCerrado() throws Exception {
		Rango r = Rango.intervaloCerrado(1, 2);
		assertEquals(1.0 , r.getInferior(), 0);

	}

	@Test
	public void testGetSuperior() {
		fail("Not yet implemented");
	}

	@Test
	public void testIntervaloAbierto() {
		fail("Not yet implemented");
	}

	@Test
	public void testIntervaloCerrado() {
		fail("Not yet implemented");
	}

	@Test
	public void testIntervaloAbiertoCerrado() {
		fail("Not yet implemented");
	}

	@Test
	public void testIntervaloCerradoAbierto() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumeroEnRango() {
		fail("Not yet implemented");
	}

	@Test
	public void testRangoEnRango() {
		fail("Not yet implemented");
	}

	@Test
	public void testSeIntersectan() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testCompareTo() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testRangoGrandote() {
		fail("Not yet implemented");
	}

	@Test
	public void testSumaRangos() {
		fail("Not yet implemented");
	}

	@Test
	public void testInterseccionRangos() {
		fail("Not yet implemented");
	}

	@Test
	public void testDesplazarRango() {
		fail("Not yet implemented");
	}

}
