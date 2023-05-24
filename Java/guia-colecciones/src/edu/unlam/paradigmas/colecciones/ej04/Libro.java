package edu.unlam.paradigmas.colecciones.ej04;

import java.util.Objects;

public class Libro {
	private String nombre;
	private int cantEjemplares;

	public Libro(String nombre, int cantEjemplares) {
		this.nombre = nombre;
		this.cantEjemplares = cantEjemplares;
	}

	@Override
	public String toString() {
		return "\nLibro [nombre=" + nombre + ", cantEjemplares=" + cantEjemplares + "]\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	
	public int getCantEjemplares() {
		return this.cantEjemplares;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(nombre, other.nombre);
	}

	
	

}
