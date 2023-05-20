package edu.unlam.paradigmas.herencia.ej01;

public class TarjetaDebito {

	private Cuenta cuenta;

	public TarjetaDebito(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public void comprar(Double monto) {
		if (monto < 0)
			throw new RuntimeException("monto de compra negativo");
		cuenta.extraer(monto);
	}
}
