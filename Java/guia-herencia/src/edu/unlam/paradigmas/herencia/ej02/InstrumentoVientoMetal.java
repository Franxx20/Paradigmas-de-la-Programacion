package edu.unlam.paradigmas.herencia.ej02;

public class InstrumentoVientoMetal extends InstrumentoViento {

	public InstrumentoVientoMetal(String nombre, String descripcion) {
		super(nombre, descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void lustrar() {
		// TODO Auto-generated method stub
		System.out.println("Se lustra el instrumento de viento de metal");
		System.out.println(this);

	}

	@Override
	public void afinar() {
		// TODO Auto-generated method stub

		System.out.println("Se afina el instrumento de viento de metal de forma automatica");
		System.out.println(this);
	}

	@Override
	public void tocar() {
	System.out.println("Se toca el instrumento de viento de metal");
	System.out.println(this);
	}

}
