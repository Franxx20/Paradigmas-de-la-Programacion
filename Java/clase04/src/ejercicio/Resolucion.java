package ejercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import archivo.Archivo;

public class Resolucion {
	public void resolver(String nombreArchivo) {
		Archivo archivo = new Archivo(nombreArchivo);
		int[] datos = archivo.leerArchivo();

		ArrayList<Integer> lista = new ArrayList<Integer>();

		for (int i = 0; i < datos.length; i++) {
			if (lista.indexOf(datos[i]) == -1) {
				lista.add(datos[i]);
			}
		}
		lista.sort(null);

		int[] resultado = new int[lista.size() + 1];
		resultado[0] = lista.size();

		for (int i = 1; i <= lista.size(); i++) {
			resultado[i] = lista.get(i-1);
		}

		archivo.guardarArchivo(resultado);
	}
	
//	public void resolver2(String nombreArchivo) {
//		Archivo archivo = new Archivo(nombreArchivo);
//		int[] datos = archivo.leerArchivo();
//		Integer[] datosInt= new Integer[datos.length];
//
//		for (int i = 0; i < datos.length; i++) {
//			datosInt[i] = datos[i];
//		}
//		
//		Set<Integer> resultado = new TreeSet<>();
//		resultado.addAll(Arrays.asList(datosInt));
//		
//		
//		archivo.guardarArchivo(resultado);
//	}
}
