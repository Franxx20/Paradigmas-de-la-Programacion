package edu.unlam.paradigmas.entradasalida.ej01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Archivo {
	private String nombre;

	public Archivo(String nombre) {
		this.nombre = nombre;
	}

	public int[] leerArchivo() {
		Scanner scanner = null;
		int[] datos = null;

		try {
			File file = new File("casos de prueba/in/" + this.nombre + ".in");
			scanner = new Scanner(file);
			// Especifica la configuración regional que se va a utilizar
			scanner.useLocale(Locale.ENGLISH);
			// Para la configuracion regional de Argentina, utilizar:
			// arch.useLocale(new Locale("es_AR"));

			int cant = scanner.nextInt();
			datos = new int[cant];

			for (int i = 0; i < cant; i++) {
				int n = scanner.nextInt();
				datos[i] = n;

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

		return datos;
	}

	public void guardarArchivo(int[] datos) {
		FileWriter file = null;
		PrintWriter PrintWriter = null;

		try {
			file = new FileWriter("casos de prueba/out/" + this.nombre + ".out");
			PrintWriter = new PrintWriter(file);

			for (int i = 0; i < datos.length; i++) {
				PrintWriter.print(datos[i] + "\n");

			}
		} catch (Exception e) {
			e.printStackTrace();
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