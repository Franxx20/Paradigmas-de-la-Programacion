package edu.unlam.paradigmas.colecciones.ej02;
import java.time.*;

public class Main {

	public static void main(String[] args) {
		Registro registro = new Registro();
		Venta venta = new Venta(1, "Jose", 30.0, LocalDateTime.now());
		Venta venta1 = new Venta(2, "Pedro", 30.0, LocalDateTime.of(2022, 10, 21, 15, 22));
		Venta venta2 = new Venta(3, "Horacio", 30.0, LocalDateTime.now());
		Venta venta3 = new Venta(4, "Pepe", 30.0, LocalDateTime.now());
		
		registro.agregarVenta(venta);
		registro.agregarVenta(venta1);
		registro.agregarVenta(venta2);
		registro.agregarVenta(venta3);


		System.out.println(registro);
		
		System.out.println(venta);
		
		System.out.println("Se busca la venta 4");
		System.out.println(registro.buscarVenta(4));
		
		System.out.println("las ventas de hoy");
		registro.mostrarVentasSegunDia(LocalDate.now());

	}

}
