package edu.unlam.paradigmas.colecciones.ej02;

import java.util.TreeSet;
import java.time.*;

public class Registro {
	TreeSet<Venta> ventas;

	public Registro(TreeSet<Venta> ventas) {
		this.ventas = ventas;
	}

	public Registro() {
		this.ventas = new TreeSet<Venta>();
	}

	public Venta buscarVenta(int nroVenta) {
		for (Venta paquete : ventas) {
			if (Integer.compare(nroVenta, paquete.getNroVenta()) == 0)
				return paquete;
		}
		return null;
	}

	public void mostrarVentasSegunDia(LocalDate fecha) {

		for (Venta venta : ventas) {
			if (venta.getFecha().toLocalDate().equals(fecha)) {
				System.out.println(venta);
			}
		}
	}

	public void agregarVenta(Venta venta) {
		if (venta == null)
			throw new RuntimeException("venta nula");
		this.ventas.add(venta);
	}

	@Override
	public String toString() {
		return "bin.edu.unlam.paradigmas.colecciones.ej05.Registro [ventas=" + ventas + "]";
	}

}
