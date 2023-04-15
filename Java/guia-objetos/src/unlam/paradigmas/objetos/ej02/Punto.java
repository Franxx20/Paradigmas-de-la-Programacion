package unlam.paradigmas.objetos.ej02;

public class Punto {
	// completar
	private double x;
	private double y;

	public double obtenerX() {
		return x;
	}

	public void cambiarX(double x) {
		this.x = x;
	}

	public double obtenerY() {
		return y;
	}

	public void cambiarY(double y) {
		this.y = y;
	}

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public boolean estaSobreEjeX() {
		return this.obtenerX() == 0.0;
	}

	public boolean estaSobreEjeY() {
		return this.obtenerY() == 0.0;
	}

	public boolean esElOrigen() {
		return this.estaSobreEjeX() && this.estaSobreEjeY();
	}

	public double distanciaAlOrigen() {
		return Math.sqrt(Math.pow(this.obtenerX(), 2) + Math.pow(this.obtenerY(), 2));
	}

	public double distanciaAotroPunto(Punto otro) {
		double x = otro.obtenerX() - this.obtenerX();
		double y = otro.obtenerY() - this.obtenerY();

		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
}
