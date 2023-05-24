package edu.unlam.paradigmas.colecciones.ej03;

import java.util.HashSet;
import java.util.Arrays;

public class RecollectorPalabras {
	private HashSet<String> palabras;

	public RecollectorPalabras(String texto) {
		String[] listaPalabras = texto.split(" ");
		for (String string : listaPalabras) {
			palabras.add(string);
		}
	}

	public RecollectorPalabras() {
		// TODO Auto-generated constructor stub
		this.palabras = new HashSet<String>();
	}

	public void agregarPalabras(String texto) {
		Arrays.asList(texto.trim().replace(".", "").replace(",", "").split(" ")).forEach(palabra -> palabras.add(palabra));
	}

	@Override
	public String toString() {
		return "RecollectorPalabras [palabras=" + palabras + "]";
	}

}
