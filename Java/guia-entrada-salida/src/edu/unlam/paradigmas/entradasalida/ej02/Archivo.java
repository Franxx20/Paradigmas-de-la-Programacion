package edu.unlam.paradigmas.entradasalida.ej02;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

import java.util.Random;
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
			// Especifica la configuraci�n regional que se va a utilizar
			scanner.useLocale(Locale.ENGLISH);
			// Para la configuraci�n regional de Argentina, utilizar:
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
			// Cerrar el archivo, eso es mucho muy importante
			scanner.close();
		}
		return datos;
	}

	public void guardarArchivo(int[] datos) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter("casos de prueba/out/" + this.nombre + ".out");
			printerWriter = new PrintWriter(file);

				// Imprime los datos y hace un salto de linea
				printerWriter.println("+----------+-------+");
				printerWriter.format("| Máximo   | %5s |\n",datos[0]);
				printerWriter.println("+----------+-------+");
				printerWriter.format("| Minimo   | %5s |\n",datos[1]);
				printerWriter.println("+----------+-------+");
				printerWriter.format("| Promedio | %5s |\n",datos[2]);
				printerWriter.println("+----------+-------+");

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
	public void crearYcargarArchivo() {
		FileWriter file = null;
		PrintWriter printWriter = null;

		try {
			file = new FileWriter("casos de prueba/in/" + this.nombre + ".in");
			printWriter = new PrintWriter(file);

			Random r = new Random();

			int cantidad = r.nextInt(20000) + 10000;
			for (int i = 0; i < cantidad; i++) {
				int numero = r.nextInt(12001);
				printWriter.println(numero);

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
