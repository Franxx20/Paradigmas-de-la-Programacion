package edu.unlam.paradigmas.herencia.ej02;

public class Lustrador {

	public void lustrarInstrumento(InstrumentoViento instrumento) {
		System.out.print("El lustrador ... ");
		instrumento.lustrar();
	}

	public void lustrarInstrumento(InstrumentoPercusion instrumento) {
		System.out.print("El lustrador ... ");
		instrumento.lustrar();
	}
}
