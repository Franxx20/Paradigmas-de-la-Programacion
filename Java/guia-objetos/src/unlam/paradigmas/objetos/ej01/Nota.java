package unlam.paradigmas.objetos.ej01;

public class Nota {

	// completar
	private int valor;

	/**
	 * pre : valorInicial está comprendido entre 0 y 10. post: inicializa la Nota
	 * con el valor indicado.
	 * @throws Exception 
	 */
	public Nota(int valorInicial) throws Exception {
		// completar
		if (valorInicial >= 0 && valorInicial <= 10) {
			this.valor = valorInicial;
		} else {
			throw new Exception("valor fuera de rangos permitidos");
		}
	}

	/**
	 * post: devuelve el valor numérico de la Nota, comprendido entre 0 y 10.
	 */
	public int obtenerValor() {
		// completar
		return this.valor;
	}

	/**
	 * post: indica si la Nota permite o no la aprobación.
	 */
	public boolean aprobado() {
		// completar
		return this.obtenerValor()>=4;
	}

	/**
	 * post: indica si la Nota implica desaprobación.
	 */
	public boolean desaprobado() {
		// completar
		return this.obtenerValor()<4;
	}
}
