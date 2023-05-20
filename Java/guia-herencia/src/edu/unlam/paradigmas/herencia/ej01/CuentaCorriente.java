package edu.unlam.paradigmas.herencia.ej01;

public class CuentaCorriente extends Cuenta {
	private double enDescubierto;

	public CuentaCorriente(double enDescubierto) {
		super();
		if (enDescubierto < 0) {
			throw new RuntimeException("el monto en descubierto no puede ser negativo");
		}
		this.enDescubierto = enDescubierto;
	}

	public double consultarEnDescubierto() {
		return enDescubierto;
	}

	public synchronized void extraerTodo() {
		historial.add(new Transaccion(this.saldo, "EXTRACCION"));
		this.saldo = 0;
	}

	public synchronized void tranferirTodo(Cuenta cuentaDestino) {
		historial.add(new Transaccion(this.consultarSaldo(), "EXTRACCION"));
		this.transferir(this.consultarSaldo(), cuentaDestino);
	}

	@Override
	public synchronized void extraer(double monto) {

		if (this.saldo == -this.enDescubierto) {
			throw new RuntimeException("no se puede extraer mas saldo");
		}
		// TODO Auto-generated method stub
		if (monto > this.enDescubierto + this.saldo) {
			throw new RuntimeException("El saldo a extraer es mayor al posible");
		}

		this.saldo -= monto;
		historial.add(new Transaccion(monto, "EXTRACCION"));
	}

}
