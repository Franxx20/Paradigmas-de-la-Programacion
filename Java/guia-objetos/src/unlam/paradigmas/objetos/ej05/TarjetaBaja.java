package unlam.paradigmas.objetos.ej05;

public class TarjetaBaja {

	private double saldo = 0;
	private int viajesBus = 0;
	private int viajesSubte = 0;

	// completar
	private static boolean mayorACero(double num) {
		return num > 0;
	}

	/**
	 * post: saldo de la Tarjeta en saldoInicial.
	 */
	public TarjetaBaja(double saldoInicial) throws Exception {
		// completar
		if (mayorACero(saldoInicial)) {
			this.saldo = saldoInicial;
		} else {

			throw new Exception("Saldo Invalido");
		}

	}

	/**
	 * post: devuelve el saldo actual de la Tarjeta
	 */
	public double obtenerSaldo() {
		return this.saldo;
	}

	/**
	 * post: agrega el monto al saldo de la Tarjeta.
	 */
	public void cargar(double monto) throws Exception {

		if (mayorACero(monto)) {
			this.saldo += monto;
		} else {
			throw new Exception("Monto invalido");
		}
	}

	/**
	 * pre : saldo suficiente. post: utiliza 39.59 del saldo para un viaje en
	 * colectivo.
	 */
	public void pagarViajeEnColectivo() throws Exception {
		// completar
		if (this.obtenerSaldo() > 39.59) {
			this.saldo -= 39.59;
			this.viajesBus++;
		} else {
			throw new Exception("No hay saldo suficiente para comprar el boleto de Colectivo");
		}
	}

	/**
	 * pre : saldo suficiente. post: utiliza 34.50 del saldo para un viaje en subte.
	 */
	public void pagarViajeEnSubte() throws Exception {
		// completar
		if (this.obtenerSaldo() > 34.50) {
			this.saldo -= 34.50;
			this.viajesSubte++;
		} else {
			throw new Exception("No hay saldo suficiente para comprar el boleto de Subte");
		}
	}

	/**
	 * post: devuelve la cantidad de viajes realizados.
	 */
	public int contarViajes() {
		// completar
		return this.viajesBus + this.viajesSubte;
	}

	/**
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	public int contarViajesEnColectivo() {
		// completar
		return this.viajesBus;
	}

	/**
	 * post: devuelve la cantidad de viajes en subte.
	 */
	public int contarViajesEnSubte() {
		// completar
		return this.viajesSubte;
	}

}
