package principal;
import productoConDescuento.ProductoConDescuento;
import producto.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p1 = new Producto("123","Pizza",10,15);
		Producto p2 = new Producto("456", "Pollo", 20,25);

		ProductoConDescuento p3 = new ProductoConDescuento("789", "Hamburguesa", 30.0, 35, 10);
		ProductoConDescuento p4 = new ProductoConDescuento("012", "Arroz", 40.0, 45, 20);
		
		p2.actualizarStock(100);
		ProductoConDescuento p5 = new ProductoConDescuento(p3);
		p5.actualizarStock(200);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
	}

}
