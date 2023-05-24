package edu.unlam.paradigmas.colecciones.ej02;

import java.time.*;
import java.util.Objects;

public class Venta implements Comparable<Venta> {
	LocalDateTime fecha;
	int nroVenta;
	String nombreCliente;
	double montoVenta;

	public Venta(int nroVenta, String nombreCliente, double montoVenta,LocalDateTime fecha) {
		this.fecha = fecha;
		this.nroVenta = nroVenta;
		this.nombreCliente = nombreCliente;
		this.montoVenta = montoVenta;
	}


	public LocalDateTime getFecha() {
		return fecha;
	}

	public int getNroVenta() {
		return nroVenta;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public double getMontoVenta() {
		return montoVenta;
	}

	@Override
	public String toString() {
		return "\nVenta [fecha=" + fecha + ", nroVenta=" + nroVenta + ", nombreCliente=" + nombreCliente
				+ ", montoVenta=" + montoVenta + "]\n";
	}

	@Override
	public int compareTo(Venta o) {
		return Integer.compare(nroVenta, o.getNroVenta());
	}

	@Override
	public int hashCode() {
		return Objects.hash(nroVenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		return nroVenta == other.nroVenta;
	}

}
