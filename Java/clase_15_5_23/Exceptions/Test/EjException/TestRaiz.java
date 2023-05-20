package EjException;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRaiz {

	@Test(expected = RaizException.class)
	public void queLanzoRaizException() throws RaizException {
		Clase c = new Clase();
		
		c.raizCuadrada(-1);
	}

}
