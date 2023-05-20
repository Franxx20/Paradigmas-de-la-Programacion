package EjException;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuenta {

	@Test(expected = SaldoInsuficienteException.class)
	public void testCuentaSinSaldoSuficiente() {
		Cuenta c = new Cuenta(1500);
		
		c.extraer(2000);
	}

}
