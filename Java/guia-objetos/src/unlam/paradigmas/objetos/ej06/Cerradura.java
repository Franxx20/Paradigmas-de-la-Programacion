package unlam.paradigmas.objetos.ej06;

public class Cerradura {

	private int clave;
	private int cantidadDeFallos;
	private int intentos = 0;
	private boolean abierto = false;
	private int aperturas = 0;
	private int bloqueos = 0;

	private static boolean mayorACero(double num) {
		return num > 0;
	}

	// completar
	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) throws Exception {

		if (mayorACero(cantidadDeFallosConsecutivosQueLaBloquean)) {
			this.clave = claveDeApertura;
			this.cantidadDeFallos = cantidadDeFallosConsecutivosQueLaBloquean;
		} else {
			throw new Exception("La cantidad de fallos para el bloqueo no puede ser negativa");
		}

	}

	public boolean abrir(int clave) {
		if (this.clave == clave && this.intentos <= this.cantidadDeFallos) {
			this.intentos = 0;
			this.abierto = true;
			return true;
		} else {
			this.intentos++;
			if (this.intentos == this.cantidadDeFallos)
				this.bloqueos++;
			return false;
		}

	}

	public void cerrar() {
		this.abierto = false;
	}

	public boolean estaAbierta() {
		return this.abierto == true;
	}

	public boolean estaCerrada() {
		return this.abierto == false;
	}

	public boolean fueBloqueada() {
		return this.intentos == this.cantidadDeFallos;
	}

	public int contarAperturasExitosas() {

		return this.aperturas;
	}

	public int contarAperturasFallidas() {
		return this.bloqueos;
	}
}
