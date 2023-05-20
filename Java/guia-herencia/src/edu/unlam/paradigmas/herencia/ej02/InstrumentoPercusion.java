package edu.unlam.paradigmas.herencia.ej02;

public class InstrumentoPercusion extends Instrumento implements Lustrable {

	public InstrumentoPercusion(String nombre, String descripcion) {
		super(nombre, descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void lustrar() {

		System.out.println("Se lustra el instrumento de percusion");
		System.out.println(this);
	}

	@Override
	public void tocar() {
		System.out.println("Se toca el instrumento de percusion");

		System.out.println(this);
	}

}
