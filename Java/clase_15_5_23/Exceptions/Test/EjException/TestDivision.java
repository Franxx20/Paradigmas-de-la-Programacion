package EjException;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDivision {

	@Test(expected = ArithmeticException.class)
	public void queLanzoException() {
		
		Clase c = new Clase();
		
		c.divison(6, 0);
	}

}
