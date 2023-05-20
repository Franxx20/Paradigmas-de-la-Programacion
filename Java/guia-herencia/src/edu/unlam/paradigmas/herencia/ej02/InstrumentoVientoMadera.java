package edu.unlam.paradigmas.herencia.ej02;

public class InstrumentoVientoMadera extends InstrumentoViento {

	public InstrumentoVientoMadera(String nombre, String descripcion) {
		super(nombre, descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void lustrar() {
		// TODO Auto-generated method stub
		System.out.println("Se lustra el instrumento de viento de madera");

		System.out.println(this);
	}

	@Override
	public void afinar() {
		// TODO Auto-generated method stub
		System.out.println("Se afina el instrumento de viento de madera de forma automatica");
		System.out.println(this);

	}

	@Override
	public void tocar() {
		System.out.println("Se toca el instrumento de viento de madera");
		System.out.println(this);
	}

}
