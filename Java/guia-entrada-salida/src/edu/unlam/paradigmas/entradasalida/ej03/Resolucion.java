package edu.unlam.paradigmas.entradasalida.ej03;

public class Resolucion {

	public void resolver(String nombreArchivo) {
		Archivo archivo = new Archivo(nombreArchivo);

		Luchador[] datos = archivo.leerArchivo();
		Cuadrilatero c = new Cuadrilatero(datos);

		int[] resultado =c.calcularDominados();

		archivo.guardarArchivos(resultado);
	}
	
	
}
