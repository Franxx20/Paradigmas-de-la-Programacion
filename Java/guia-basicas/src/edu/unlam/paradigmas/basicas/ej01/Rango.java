package edu.unlam.paradigmas.basicas.ej01;

import java.util.Objects;

public class Rango implements Comparable<Rango> {

	private double inferior;
	private double superior;
	private final boolean inferiorCerrado;
	private final boolean superiorCerrado;

//	private Tipo tipo;
//
	public double getInferior() {
		return inferior;
	}

//
	public double getSuperior() {
		return superior;
	}

	private Rango(double inf, double sup, boolean infCerrado, boolean supCerrado) throws Exception {
		if (inf > sup)
			throw new Exception("el valor inf no puede ser mayor al sup");
		if (Double.isInfinite(inf) || Double.isInfinite(sup))
			throw new IllegalArgumentException("los limites tiene que ser finitos");

		this.inferior = inf;
		this.superior = sup;
		this.inferiorCerrado = infCerrado;
		this.superiorCerrado = supCerrado;

	}

	static public Rango intervaloAbierto(double inferior, double superior) throws Exception {
		return new Rango(inferior - Double.MIN_VALUE, superior - Double.MIN_VALUE, false, false);
	}

	static public Rango intervaloCerrado(double inferior, double superior) throws Exception {

		return new Rango(inferior, superior, true, true);
	}

	static public Rango intervaloAbiertoCerrado(double inferior, double superior) throws Exception {

		return new Rango(inferior - Double.MIN_VALUE, superior, false, true);
	}

	static public Rango intervaloCerradoAbierto(double inferior, double superior) throws Exception {

		return new Rango(inferior, superior - Double.MIN_VALUE, true, false);
	}

	public boolean numeroEnRango(double numero) {
		return numero >= this.getInferior() && numero <= this.getSuperior();
	}

	private boolean EsCerrado() {
		return this.inferiorCerrado == true && this.superiorCerrado == true;
	}

	public boolean rangoEnRango(Rango rango) {
		if (rango == null)
			return false;
		return rango.getInferior() > this.getInferior() && rango.getSuperior() < this.getSuperior();
	}

	public boolean seIntersectan(Rango rango) {
		if (rango == null)
			return false;

		return (this.getInferior() <= rango.getInferior() && this.getSuperior() >= rango.getInferior())
				|| (this.getInferior() >= rango.getInferior() && this.getInferior() <= rango.getSuperior());
	}

	@Override
	public int hashCode() {
		return Objects.hash(inferior, inferiorCerrado, superior, superiorCerrado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rango other = (Rango) obj;
		return Double.doubleToLongBits(inferior) == Double.doubleToLongBits(other.inferior)
				&& inferiorCerrado == other.inferiorCerrado
				&& Double.doubleToLongBits(superior) == Double.doubleToLongBits(other.superior)
				&& superiorCerrado == other.superiorCerrado;
	}

	@Override
	public int compareTo(Rango o) {
		int resultado = Double.compare(this.getInferior(), o.getInferior());
		if (resultado == 0) {
			resultado = Double.compare(this.getSuperior(), o.getSuperior());
			if (resultado == 0) {

				if (this.EsCerrado() == true && o.EsCerrado() == false) {
					return -1;
				} else if (o.EsCerrado() == true && this.EsCerrado() == false) {
					return 1;
				} else
					return 0;

			}
		}

		return resultado;
	}

	@Override
	public String toString() {
		return "Rango [inferior=" + inferior + ", superior=" + superior + "]";
	}

	public static Rango rangoGrandote() throws Exception {
		return Rango.intervaloCerrado(Double.MIN_VALUE, Double.MAX_VALUE);
	}

	public Rango sumaRangos(Rango rango) throws Exception {
		return new Rango(this.getInferior(), rango.getSuperior(), this.inferiorCerrado, rango.superiorCerrado);
	}

	public Rango interseccionRangos(Rango rango) throws Exception {
		if (this.seIntersectan(rango) == true) {

			double inf = Double.max(this.getInferior(), rango.getInferior());
			boolean infCerrado = this.inferiorCerrado;
			if (inf == rango.getInferior()) {
				infCerrado = rango.inferiorCerrado;

			}

			double sup = Double.min(this.getSuperior(), rango.getSuperior());
			boolean supCerrado = this.superiorCerrado;
			if (sup == rango.getSuperior()) {
				supCerrado = rango.superiorCerrado;
			}
			return new Rango(inf, sup, infCerrado, supCerrado);
		}
		return Rango.intervaloAbierto(0.0, 0.0);
	}

	public Rango desplazarRango(double numero) throws Exception {
		return new Rango(this.getInferior() + numero, this.getSuperior() + numero, this.inferiorCerrado,
				this.superiorCerrado);
	}
}
