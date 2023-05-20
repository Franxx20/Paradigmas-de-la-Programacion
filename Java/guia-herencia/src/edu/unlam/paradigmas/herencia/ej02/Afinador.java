package edu.unlam.paradigmas.herencia.ej02;

public class Afinador {

	public void afinarInstrumento(InstrumentoViento instrumento) {
		System.out.print("El afinador ... ");
		instrumento.afinar();
	}
	
	public void afinarInstrumento(InstrumentoCuerda instrumento) {
		System.out.print("El afinador ... ");
		instrumento.afinar();
	}
}
