package fraccion;

import static org.junit.Assert.*;

import org.junit.Test;

import package1.Fraccion;

public class FraccionTEST {
	
	@Test(expected = Exception.class)
	public void divPorCero()throws Exception{
		@SuppressWarnings("unused")
		Fraccion f = new Fraccion(23,0);
	}
	
	@Test
	public void testSimplificar() throws Exception {
		Fraccion f1 = new Fraccion(12,18);
		Fraccion real = f1.simplificar();
		Fraccion esperado = new Fraccion(2,3);
		assertEquals(esperado, real);
//		assertEquals("2/3",f2.toString()); //NO HACER
		assertEquals(2,real.getNum());
		assertEquals(3,real.getDen());
	}
	@Test
	public void equals() throws Exception {
		Fraccion real = new Fraccion(12,18);
		Fraccion esperado = new Fraccion(4,6);
		assertEquals(esperado, real);

	}
	@Test
	public void testMultiplicar() throws Exception {
		Fraccion f1 = new Fraccion(2,3);
		Fraccion f2 = new Fraccion(3,5);
		Fraccion f3 = f1.multiplicar(f2);
		
		assertEquals(2,f3.getNum());
		assertEquals(5,f3.getDen());
	}
	@Test
	public void testMultiplicarEscalar() throws Exception {
		Fraccion f1 = new Fraccion(2,3);

		Fraccion f3 = f1.multiplicar(9);
		
		assertEquals(6,f3.getNum());
		assertEquals(1,f3.getDen());
	}

	@Test
	public void testSumar() throws Exception {
		Fraccion f1 = new Fraccion(2,3);
		Fraccion f2 = new Fraccion(3,5);
		Fraccion f3 = f1.sumar(f2);
		
		assertEquals(19,f3.getNum());
		assertEquals(15,f3.getDen());
	}

	@Test
	public void testDividir() throws Exception {
		Fraccion f1 = new Fraccion(2,3);
		Fraccion f2 = new Fraccion(3,5);
		Fraccion f3 = f1.dividir(f2);
		
		assertEquals(10,f3.getNum());
		assertEquals(9,f3.getDen());
	}

	@Test
	public void testRestar() throws Exception {
		Fraccion f1 = new Fraccion(2,3);
		Fraccion f2 = new Fraccion(3,5);
		Fraccion f3 = f1.restar(f2);
		
		assertEquals(1,f3.getNum());
		assertEquals(15,f3.getDen());
	}
	

	@Test
	public void compararMayorACero() throws Exception {
		Fraccion f1 = new Fraccion(4,5);
		Fraccion f2 = new Fraccion(3,4);
		assert(f1.compareTo(f2)>0);
	}
	@Test
	public void compararMenorACero() throws Exception {
		Fraccion f1 = new Fraccion(2,4);
		Fraccion f2 = new Fraccion(10,8);
		assert(f1.compareTo(f2)<0);
	}
	@Test
	public void compararIgualACero() throws Exception {
		Fraccion f1 = new Fraccion(2,4);
		Fraccion f2 = new Fraccion(4,8);
		assert(f1.compareTo(f2)==0);
	}

}
