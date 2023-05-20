package edu.unlam.paradigmas.herencia.ej01;

public class PlazoFijo {
	private double montoFijo = 0;
	Cuenta cuenta;

	public PlazoFijo(double monto, Cuenta cuenta) {
		this.montoFijo = monto;
		cuenta.extraer(monto);
		this.cuenta = cuenta;
	}

	public void integrarInteresesMes() {
		this.montoFijo = ((103 * this.montoFijo) / 100);
	}

}
