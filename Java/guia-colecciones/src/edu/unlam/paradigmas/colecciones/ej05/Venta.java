package edu.unlam.paradigmas.colecciones.ej05;

import java.time.LocalDate;

public class Venta {
	private LocalDate fecha;
	int nroVenta;
	double monto;

	public Venta(int nroVenta, double monto, LocalDate fecha) {
		this.nroVenta = nroVenta;
		this.monto = monto;
		this.fecha = fecha;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null || getClass() != object.getClass())
			return false;
		if (!super.equals(object))
			return false;

		Venta venta = (Venta) object;

		if (nroVenta != venta.nroVenta)
			return false;
		if (java.lang.Double.compare(venta.monto, monto) != 0)
			return false;
		if (fecha != null ? !fecha.equals(venta.fecha) : venta.fecha != null)
			return false;

		return true;
	}

	public int hashCode() {
		int result = super.hashCode();
		long temp;
		result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
		result = 31 * result + nroVenta;
		temp = Double.doubleToLongBits(monto);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "Venta [fecha=" + fecha + ", nroVenta=" + nroVenta + ", monto=" + monto + "]";
	}

	public static double acumularMonto(double monto1, double monto2) {
		return monto1 + monto2;
	}
}
