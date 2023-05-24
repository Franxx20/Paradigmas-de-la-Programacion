package edu.unlam.paradigmas.colecciones.ej04;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColeccionLibrosUnicos coleccion = new ColeccionLibrosUnicos();
		Random rand = new Random();

		String[] nombres = { "El Gran Gatsby", "Cien años de soledad", "1984", "Matar a un ruiseñor",
				"El señor de los anillos", "Harry Potter y la piedra filosofal", "El código Da Vinci",
				"La sombra del viento", "El nombre del viento", "El psicoanalista" };

		for (int i = 0; i < 10; i++) {
			int nroEjemplares = rand.nextInt(5) + 1;
			coleccion.agregarLibro(new Libro(nombres[rand.nextInt(nombres.length)], nroEjemplares));
		}
		System.out.println(coleccion);

	}
}
