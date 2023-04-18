package cerradura;

import static org.junit.Assert.*;

import org.junit.Test;

import unlam.paradigmas.objetos.ej06.Cerradura;

public class CerraduraTEST {

	@Test(expected = Exception.class)
	public void cerraduraSinIntentos() throws Exception{
		@SuppressWarnings("unused")
		Cerradura c = new Cerradura(123,0);
	}

	@Test()
	public void cerraduraOk() throws Exception{
		@SuppressWarnings("unused")
		Cerradura c = new Cerradura(123,1);
	}


	@Test
	public void aperturaExitosa() throws Exception {
		Cerradura c = new Cerradura(123,1);
		
		c.abrir(123);
		
		assertTrue(c.estaAbierta());
		

	}

	@Test
	public void aperturaFallida() throws Exception {
		Cerradura c = new Cerradura(123,1);
		
		c.abrir(321);
		c.abrir(122);
		
		assertFalse(c.estaAbierta());

	}

	@Test
	public void cerrar() throws Exception {
		Cerradura c = new Cerradura(123,1);
		
		c.cerrar();
		
		assertTrue(c.estaCerrada());

	}

	@Test
	public void testFueBloqueada() throws Exception {
		Cerradura c = new Cerradura(123,1);
		
		c.abrir(321);
		c.abrir(322);
		
		assertTrue(c.fueBloqueada());
	}

	@Test
	public void ContarAperturasExitosas() throws Exception {
		Cerradura c = new Cerradura(123,1);
		
		c.abrir(123);
		c.cerrar();
		c.abrir(123);
		c.cerrar();
		c.abrir(123);

		
		
		assertEquals(c.contarAperturasExitosas(),3);
		
		
		
	}

	@Test
	public void ContarAperturasFallidas() throws Exception{
		Cerradura c = new Cerradura(123,5);
		
		c.abrir(321);
		c.abrir(321);
		c.abrir(321);
		c.abrir(321);
		
		assertEquals(4,c.contarAperturasFallidas());
		
		
		
	}

}
