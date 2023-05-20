package edu.unlam.paradigmas.herencia.ej01;

import java.util.ArrayList;

public class Cuenta {
	protected double saldo;
	protected ArrayList<Transaccion> historial;

	public Cuenta() {
		this.historial = new ArrayList<Transaccion>();
	}

	public double consultarSaldo() {
		return this.saldo;
	}

	public ArrayList<Transaccion> consultarHistorial() {
		return this.historial;
	}

	public synchronized void depositar(double monto) {
		this.saldo += monto;

		historial.add(new Transaccion(monto, "DEPOSITO"));
	}

	public synchronized void extraer(double monto) {
		if (monto > this.saldo) {
			throw new RuntimeException("Monto a extraer mayor al saldo disponible");
		}

		this.saldo -= monto;
		historial.add(new Transaccion(monto, "EXTRACCION"));
	}

	// the syncronized keyword permite que solo un hilo acceda a la funcion a la vez
	public synchronized void transferir(double monto, Cuenta cuentaDestino) {
		if (monto > this.saldo) {
			throw new RuntimeException("Monto a extraer mayor al saldo disponible");
		}

		this.saldo -= monto;

		cuentaDestino.saldo += monto;
		historial.add(new Transaccion(monto, "TRANSFERENCIA"));
	}

}
