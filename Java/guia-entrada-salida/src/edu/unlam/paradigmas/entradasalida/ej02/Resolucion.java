package edu.unlam.paradigmas.entradasalida.ej02;

import edu.unlam.paradigmas.entradasalida.ej02.Archivo;

public class Resolucion {
	public void resolver(String nombreArchivo) {
		Archivo archivo = new Archivo(nombreArchivo);
		archivo.crearYcargarArchivo();

		int[] datos = archivo.leerArchivo();

		int mayor = datos[0];
		int menor = datos[0];
		int promedio = datos[0];

		if (datos.length == 0)
			throw new ArithmeticException("cero");

		for (int i = 0; i < datos.length; i++) {
			if (datos[i] > mayor)
				mayor = datos[i];
			else if (datos[i] < menor)
				menor = datos[i];
			promedio += datos[i];
		}
		promedio /= datos.length;

		int resultado[] = { mayor, menor, promedio };

		archivo.guardarArchivo(resultado);

	}

}
