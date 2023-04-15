package unlam.paradigmas.objetos.ej03;

public class Circulo {
	// completar
	private double radio;
//	private double perimetro;
//	private double area;

	public Circulo(double radio) throws Exception {
		if (radio > 0) {
			this.radio = radio;
		} else
			throw new Exception("radio invalido");

	}

	public double obtenerRadio() {
		return radio;
	}

	public void cambiarRadio(double radio) throws Exception {
		if (radio > 0)
			this.radio = Math.abs(radio);
		else
			throw new Exception("radio invalido");
	}

	public double obtenerPerimetro() {
		return 2 * this.radio * Math.PI;
	}

	public void cambiarPerimetro(double perimetro) throws Exception {
		if (perimetro > 0) {

			this.radio = perimetro / (2 * Math.PI);

		} else {
			throw new Exception("Perimetro invalido");
		}
	}

	public double obtenerArea() {
		return Math.PI * this.radio * this.radio;
	}

	public void cambiarArea(double area) throws Exception {
		if (area > 0)
			this.radio = Math.sqrt(area / Math.PI);
		else
			throw new Exception("area invalida");
	}

	public double obtenerDiametro() {

		return this.obtenerRadio() * 2;

	}

	public void cambiarDiametro(double diametro) throws Exception {
		if (diametro > 0)
			this.radio = diametro / 2.0;
		else
			throw new Exception("diametro invalido");
	}
}
