package unlam.paradigmas.objetos.ej04;

public class Cubo {

	// completar
	private double lado;

	private static boolean mayorACero(double num) {
		return num > 0;
	}

	/**
	 * pre : longitudLado es un valor mayor a 0. post: inicializa el cubo a partir
	 * de la longitud de lado dada
	 */
	public Cubo(double longitudLado) throws Exception {
		// completar
		if (mayorACero(longitudLado)) {

			this.lado = longitudLado;
		} else
			throw new Exception("valor ingresado menor a Zero");

	}

	/**
	 * post: devuelve la longitud de todos los lados del cubo
	 */
	public double obtenerLado() {
		// completar
		return this.lado;
	}

	/**
	 * pre : longitudLado es un valor mayor a 0. post: cambia la longitud de todos
	 * los lados del cubo
	 */
	public void cambiarLado(double longitudLado) throws Exception {

		if (mayorACero(longitudLado)) {

			this.lado = longitudLado;
		} else {
			throw new Exception("lado ingresado menor a Zero");
		}
	}

	/**
	 * post: devuelve el área de la superficie de las caras del cubo
	 */
	public double obtenerAreaCara() {
		return Math.pow(this.obtenerLado(), 2);
	}

	/**
	 * pre: areaCara es un valor mayor a 0. post: cambia el área de las caras del
	 * cubo
	 */
	public void cambiarAreaCara(double areaCara) throws Exception {
		// completar
		if (mayorACero(areaCara)) {
			this.lado = Math.sqrt(areaCara);
		} else
			throw new Exception("Lado ingresado es menor a Zero");
	}

	/**
	 * post: devuelve el volumen que encierra el cubo
	 */
	public double obtenerVolumen() {
		// completar

		return Math.pow(this.obtenerLado(), 3);

	}

	/**
	 * pre: volumen es un valor mayor a 0. post: cambia el volumen del cubo
	 */
	public void cambiarVolumen(double volumen) throws Exception {
		// completar
		if (mayorACero(volumen)) {
			this.lado = Math.cbrt(volumen);
		} else
			throw new Exception("Volumen ingresado es menor a Zero");
	}
}
