package edu.unlam.paradigmas.herencia.ej02;

import java.util.ArrayList;

public class Orquesta {
	public ArrayList<Instrumento> instrumentos;

	public Orquesta(ArrayList<Instrumento> instrumentos) {
		super();
		this.instrumentos = instrumentos;
	}

	public Orquesta() {
		this.instrumentos = new ArrayList<Instrumento>();
	}

	public void tocarTodosLosInstrumentos() {
		System.out.println("El concierto empieza ...");
		for (Instrumento instrumento : instrumentos) {
			instrumento.tocar();
		}

	}

	public void tocarInstrumentosDeViento() {
		System.out.println("El concierto utiliza los instrumentos de viento...");
		for (Instrumento instrumento : instrumentos) {

			if (instrumento instanceof InstrumentoViento) {
				instrumento.tocar();
			}
		}

	}

	public void tocarInstrumentosDeCuerda() {
		System.out.println("El concierto utiliza los instrumentos de viento...");
		for (Instrumento instrumento : instrumentos) {

			if (instrumento instanceof InstrumentoCuerda) {
				instrumento.tocar();
			}
		}

	}

	public void tocarInstrumentosDePercusion() {
		System.out.println("El concierto utiliza los instrumentos de viento...");
		for (Instrumento instrumento : instrumentos) {

			if (instrumento instanceof InstrumentoPercusion) {
				instrumento.tocar();
			}
		}

	}

	public void consultarInstrumentos() {
		System.out.println(instrumentos);
	}

}
