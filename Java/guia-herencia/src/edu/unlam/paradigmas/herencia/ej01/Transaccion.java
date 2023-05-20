package edu.unlam.paradigmas.herencia.ej01;

import java.time.LocalDateTime;

public class Transaccion {

	private LocalDateTime fecha;
	private double monto;
	private String motivo;

	public Transaccion(double monto, String motivo) {
		super();
		this.monto = monto;
		this.motivo = motivo;
		this.fecha = LocalDateTime.now();
	}

	@Override
	public String toString() {
		return "Transaccion [motivo=" + motivo + "]" + "[monto=" + monto + "]" + "[fecha=" + fecha + "]" + "\n";

	}

	public double consultarMonto() {
		return this.monto;
	}
}
