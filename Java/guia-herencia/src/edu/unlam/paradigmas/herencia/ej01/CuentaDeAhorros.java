package edu.unlam.paradigmas.herencia.ej01;

public class CuentaDeAhorros extends Cuenta {
	private double saldoAhorro;

	public CuentaDeAhorros() {
		super();
		this.saldoAhorro = 0;
	}

	public double consultarSaldoAhorro() {
		return saldoAhorro;
	}

	public synchronized void reservarSaldo(double monto) {
		try {
			this.extraer(monto);
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("monto a reservar mayor al saldo disponible");
		}

		this.saldoAhorro += monto;
		historial.add(new Transaccion(monto, "RESERVA"));

	}

	public synchronized void reintegrarSaldoAhorro(double monto) {
		if (monto > saldoAhorro) {
			throw new RuntimeException("monto mayor al saldo de ahorro disponible");
		}

		this.saldoAhorro -= monto;
		this.depositar(monto);

		historial.add(new Transaccion(monto, "REINTEGRO"));
	}

}
