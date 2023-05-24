package edu.unlam.paradigmas.colecciones.ej05;

import java.util.HashMap;

public class Registro {

	HashMap<Integer, Double> ventas = new HashMap<Integer, Double>();
//	HashMap<String, String> test = new HashMap<String, String>();

	public Registro() {
		this.ventas = new HashMap<Integer, Double>();
		for (int i = 1; i < 13; i++) {

			this.ventas.put(i, 0.0);

		}

//		this.test.put("Hola", " yo soy");
//		this.test.merge("Hola", " Franco", (string1, string2) -> string1 + string2);
//		System.out.println(this.test);
	}

	public void acumularMontoVenta(Venta venta) {
//		this.ventas.merge(venta.getFecha().getMonthValue(), venta.monto, Venta::acumularMonto);
		this.ventas.merge(venta.getFecha().getMonthValue(), venta.monto, (monto1, monto2) -> monto1 + monto2);
	}

	@Override
	public String toString() {
		return "Registro [ventas=" + ventas + "]";
	}

}
