package edu.unlam.paradigmas.herencia.ej02;

public class InstrumentoCuerda extends Instrumento implements Afinable {

	public InstrumentoCuerda(String nombre, String descripcion) {
		super(nombre, descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afinar() {
		// TODO Auto-generated method stub
		System.out.println("se afina el instrumento de cuerda");
		System.out.println(this);

	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub

		System.out.println("se toca el instrumento de cuerda");
		System.out.println(this);
	}

}
