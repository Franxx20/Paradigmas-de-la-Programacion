package edu.unlam.paradigmas.herencia.ej02;

public abstract class Instrumento {
	protected String nombre;
	protected String descripcion;

	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

	public abstract void tocar();

	public Instrumento(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

}
