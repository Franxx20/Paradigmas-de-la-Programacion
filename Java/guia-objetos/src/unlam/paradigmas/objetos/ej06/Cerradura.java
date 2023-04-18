package unlam.paradigmas.objetos.ej06;

public class Cerradura {

	private int clave;
	private int intentosMaximo;
	private int aperturasFallidasConsecutivas;
	private int aperturasExitosas;
	private int cantidadFallidos;

	private enum Estado {
		ABIERTO, CERRADO, BLOQUEADO
	};

	Estado estado;

	private static boolean mayorACero(double num) {
		return num > 0;
	}

	// completar
	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) throws Exception {

		if (mayorACero(cantidadDeFallosConsecutivosQueLaBloquean)) {
			this.clave = claveDeApertura;
			this.intentosMaximo = cantidadDeFallosConsecutivosQueLaBloquean;
			this.estado = Estado.CERRADO;
			this.aperturasFallidasConsecutivas = 0;
			this.intentosMaximo = 0;
		} else {
			throw new Exception("La cantidad de fallos para el bloqueo incorrecta");
		}

	}

	public boolean abrir(int clave) {
		if (this.clave == clave) {
			this.estado = Estado.ABIERTO;
			this.aperturasFallidasConsecutivas = 0;
			this.aperturasExitosas++;
			return true;
		} else {
			aperturasFallidasConsecutivas++;
			this.cantidadFallidos++;
		}

		if (this.aperturasFallidasConsecutivas == this.intentosMaximo) {
		} else {
			this.estado = Estado.BLOQUEADO;
		}

		return false;

	}

	public void cerrar() {
		if (this.estado != Estado.BLOQUEADO)
			this.estado = Estado.CERRADO;
	}

	public boolean estaAbierta() {
		return this.estado == Estado.ABIERTO;
	}

	public boolean estaCerrada() {
		return this.estado == Estado.CERRADO;
	}

	public boolean fueBloqueada() {
		return this.estado == Estado.BLOQUEADO;
	}

	public int contarAperturasExitosas() {
		return this.aperturasExitosas;
	}

	public int contarAperturasFallidas() {
		return this.cantidadFallidos;
	}
}
