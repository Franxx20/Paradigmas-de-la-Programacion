package edu.unlam.paradigmas.entradasalida.ej03;

import java.util.Locale;
import java.util.Scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {
	private String nombre;

	public Archivo(String nombre) {
		this.nombre = nombre;
	}

	public Luchador[] leerArchivo() {
		Scanner scanner = null;
		Luchador[] datos = null;

		try {
			File file = new File("casos de prueba/in/" + this.nombre + ".in");
			scanner = new Scanner(file);

			scanner.useLocale(Locale.ENGLISH);

			int cant = scanner.nextInt();
			datos = new Luchador[cant];
			for (int i = 0; i < cant; i++) {
				int peso = scanner.nextInt();
				int altura = scanner.nextInt();
				datos[i]= new Luchador(peso, altura);
			}

		} catch (Exception e) {
			System.out.println("error en la lectura del archivo");
		} finally {
			scanner.close();
		}

		return datos;
	}

	public void guardarArchivos(int[] resultado) {
		FileWriter file = null;
		PrintWriter printWriter = null;

		try {
			file = new FileWriter("casos de prueba/out/" + this.nombre + ".out");
			printWriter = new PrintWriter(file);

			for (int i = 0; i < resultado.length; i++) {
				printWriter.println(resultado[i]);
			}
		} catch (Exception e) {
			System.out.println("error en el guardado");
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
