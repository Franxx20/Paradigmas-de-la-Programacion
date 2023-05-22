package edu.unlam.paradigmas.colecciones.ej01;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Registro registro = new Registro();
		Paquete paquete = new Paquete(123, "Reino Unido", "Argentina", 20);
		Paquete paquete2 = new Paquete(321, "Paraguay", "Bolivia", 30);
		Paquete paquete3 = new Paquete(456, "Bolivia", "Argentina", 10);
		Paquete paquete4 = new Paquete(123, "Chile", "Peru", 5);

		registro.agregarPaquete(paquete);
		registro.agregarPaquete(paquete2);
		registro.agregarPaquete(paquete3);
		registro.agregarPaquete(paquete4);
		
		System.out.println(registro);

		Paquete paqueteBuscado = registro.buscarPaquete(321);

		System.out.println("El paquete buscado es " + paqueteBuscado);
		HashSet<Paquete> resultado = registro.buscarPorPeso(15);

		System.out.println("La lista resultado es " + resultado);
	}

}
