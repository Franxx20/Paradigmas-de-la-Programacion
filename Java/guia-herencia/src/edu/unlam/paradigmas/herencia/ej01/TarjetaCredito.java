package edu.unlam.paradigmas.herencia.ej01;

import java.util.ArrayList;

public class TarjetaCredito {
	Cuenta cuenta;
	private ArrayList<Transaccion> historialCompras;

	public TarjetaCredito(Cuenta cuenta) {
		super();
		this.cuenta = cuenta;
		this.historialCompras = new ArrayList<Transaccion>();
	}

	public void comprar(double monto) {
		if (monto < 0)
			throw new RuntimeException("monto de compra negativo");
		this.historialCompras.add(new Transaccion(monto, "Compra"));
	}

	public void debitarMes() {
		double montoTotal = 0;
		for (Transaccion transaccion : historialCompras) {
			montoTotal += transaccion.consultarMonto();
		}

		cuenta.extraer((103 * montoTotal) / 100);
	}

}
