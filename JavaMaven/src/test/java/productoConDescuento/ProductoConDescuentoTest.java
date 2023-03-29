package productoConDescuento;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProductoConDescuentoTest {
	ProductoConDescuento p3=null;
	@Before
	public void setup() {
		p3 = new ProductoConDescuento("789", "Hamburguesa", 30.0, 35, 10);

	}

	@Test
	public void testGetPrecioFinal() {


		assertEquals(27, p3.GetPrecioFinal(),0);

	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
