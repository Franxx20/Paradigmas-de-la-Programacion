package edu.unlam.paradigmas.colecciones.ej04;

import java.util.HashSet;

public class ColeccionLibrosUnicos {
	HashSet<Libro> libros;

	public ColeccionLibrosUnicos() {
		this.libros = new HashSet<Libro>();
	}

	public void agregarLibro(Libro libro) {

		if (libro.getCantEjemplares() == 1)
			this.libros.add(libro);
	}

	@Override
	public String toString() {
		return "ColeccionLibrosUnicos [libros=" + libros + "]";
	}

}
