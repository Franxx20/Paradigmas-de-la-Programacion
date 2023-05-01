package edu.unlam.paradigmas.basicas.ej01;

import java.util.Objects;

public class Rango implements Comparable<Rango>{
	private double inferior;
	private double superior;

	public double getInferior() {
		return inferior;
	}

	public void setInferior(double inferior) {
		this.inferior = inferior;
	}

	public double getSuperior() { return superior; } public void setSuperior(double superior) {
		this.superior = superior;
	}

	private Rango(double inferior, double superior) throws Exception {
		if (inferior > superior)
			throw new Exception("el valor inferior no puede ser mayor al superior");
		if (Double.isInfinite(inferior) || Double.isInfinite(superior))
			throw new IllegalArgumentException("los limites tiene que ser finitos");
		this.inferior = inferior;
		this.superior = superior;
	}

	static public Rango intervaloAbierto(double inferior, double superior) throws Exception {
		return new Rango(inferior - Double.MIN_VALUE, superior - Double.MIN_VALUE);
	}

	static public Rango intervaloCerrado(double inferior, double superior) throws Exception {

		return new Rango(inferior, superior);
	}

	static public Rango intervaloAbiertoCerrado(double inferior, double superior) throws Exception {

		return new Rango(inferior - Double.MIN_VALUE, superior);
	}

	static public Rango intervaloCerradoAbierto(double inferior, double superior) throws Exception {

		return new Rango(inferior, superior - Double.MIN_VALUE);
	}

	public boolean numeroEnRango(double numero) {
		return numero >= this.getInferior() && numero <= this.getSuperior();
	}

	public boolean rangoEnRango(Rango rango) {
		if (rango == null)
			return false;
		return rango.getInferior() > this.getInferior() && rango.getSuperior() < this.getSuperior();
	}

	@Override
	public int hashCode() {
		return Objects.hash(inferior, superior);
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
				&& Double.doubleToLongBits(superior) == Double.doubleToLongBits(other.superior);
	}

	public boolean seIntersectan(Rango rango) {
		if (rango == null)
			return false;
		return this.getInferior() >= rango.getSuperior() && this.getInferior() <= rango.getSuperior();
	}

	@Override
	public int compareTo(Rango o) {
		return 0;
	}
	
	public boolean rangosIguales(Rango rango) {
		return this.getInferior() == rango.getSuperior() && this.getInferior() == rango.getSuperior();
	}

}
