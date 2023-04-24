package tarjetaBaja;

import static org.junit.Assert.*;

import org.junit.Test;

import unlam.paradigmas.objetos.ej05.TarjetaBaja;

public class tarjetaBajaTEST {

	@Test(expected = Exception.class)
	public void saldoInicialNegativo() throws Exception {
		@SuppressWarnings("unused")
		TarjetaBaja tarjetaNegativa = new TarjetaBaja(-1);
	}

	@Test
	public void obtenerSaldo() throws Exception {
		TarjetaBaja t = new TarjetaBaja(3);
		assertEquals(3.0, t.obtenerSaldo(), 0.001);

	}

	@Test(expected = Exception.class)
	public void cargarNegativo() throws Exception {
		TarjetaBaja t = new TarjetaBaja(3);
		t.cargar(0);
	}

	@Test(expected = Exception.class)
	public void saldoColectivoInsuficiente() throws Exception {
		TarjetaBaja t = new TarjetaBaja(39.58);
		t.pagarViajeEnColectivo();

	}

	@Test
	public void saldoColectivoSuficiente() throws Exception {
		TarjetaBaja t = new TarjetaBaja(39.59);
		t.pagarViajeEnColectivo();
	}

	@Test(expected = Exception.class)
	public void saldoSubteInsuficiente() throws Exception {
		TarjetaBaja t = new TarjetaBaja(34.49);
		t.pagarViajeEnSubte();

	}

	@Test
	public void saldoSubteSuficiente() throws Exception {
		TarjetaBaja t = new TarjetaBaja(34.50);
		t.pagarViajeEnSubte();
	}

	@Test
	public void testContarViajes() throws Exception {
		TarjetaBaja t = new TarjetaBaja(99999);
		t.pagarViajeEnColectivo();
		t.pagarViajeEnColectivo();
		t.pagarViajeEnColectivo();
		t.pagarViajeEnColectivo();

		t.pagarViajeEnSubte();
		t.pagarViajeEnSubte();
		t.pagarViajeEnSubte();
		t.pagarViajeEnSubte();
		t.pagarViajeEnSubte();

		assertEquals(9, t.contarViajes());
	}

	@Test
	public void testContarViajesEnColectivo() throws Exception {
		TarjetaBaja t = new TarjetaBaja(99999);
		t.pagarViajeEnColectivo();
		t.pagarViajeEnColectivo();
		t.pagarViajeEnColectivo();
		t.pagarViajeEnColectivo();

		assertEquals(4, t.contarViajesEnColectivo());

	}

	@Test
	public void testContarViajesEnSubte() throws Exception {
		TarjetaBaja t = new TarjetaBaja(99999);

		t.pagarViajeEnSubte();
		t.pagarViajeEnSubte();
		t.pagarViajeEnSubte();
		t.pagarViajeEnSubte();
		t.pagarViajeEnSubte();

		assertEquals(5, t.contarViajesEnSubte());

	}

}
