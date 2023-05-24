package edu.unlam.paradigmas.colecciones.ej05;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Registro registro = new Registro();

		Venta venta = new Venta(1, 20.0, LocalDate.of(2023, 1, 21));
		Venta venta1 = new Venta(1, 20.0, LocalDate.of(2023, 1, 21));
		Venta venta2 = new Venta(1, 20.0, LocalDate.of(2023, 1, 21));
		Venta venta3 = new Venta(1, 20.0, LocalDate.of(2023, 1, 21));
		Venta venta4 = new Venta(1, 20.0, LocalDate.of(2023, 2, 21));
		Venta venta7 = new Venta(1, 20.0, LocalDate.now());

		Venta venta5 = new Venta(1, 30.0, LocalDate.of(2023, 3, 21));
		Venta venta6 = new Venta(1, 40.0, LocalDate.of(2023, 4, 21));


		registro.acumularMontoVenta(venta);
		registro.acumularMontoVenta(venta1);
		registro.acumularMontoVenta(venta2);
		registro.acumularMontoVenta(venta3);
		registro.acumularMontoVenta(venta4);
		registro.acumularMontoVenta(venta5);
		registro.acumularMontoVenta(venta6);
		registro.acumularMontoVenta(venta7);

		System.err.println(registro);
	}

}
