package edu.unlam.paradigmas.herencia.ej02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orquesta concierto = new Orquesta();
		Lustrador lustrador = new Lustrador();
		Afinador afinador = new Afinador();

		concierto.instrumentos.add(new InstrumentoVientoMadera("madera", "instrumento de viento de madera"));
		concierto.instrumentos.add(new InstrumentoVientoMetal("metal", "instrumento de viento de metal"));
		concierto.instrumentos.add(new InstrumentoPercusion("percusion1", "instrumento de percusion"));
		concierto.instrumentos.add(new InstrumentoPercusion("percusion2", "instrumento de percusion"));
		concierto.instrumentos.add(new InstrumentoPercusion("percusion3", "instrumento de percusion"));
		concierto.instrumentos.add(new InstrumentoCuerda("cuerda2", "instrumento de cuerda"));
		concierto.instrumentos.add(new InstrumentoCuerda("cuerda2", "instrumento de cuerda"));
		concierto.instrumentos.add(new InstrumentoCuerda("cuerda2", "instrumento de cuerda"));

		lustrador.lustrarInstrumento(new InstrumentoPercusion("percusion2", "instrumento de percusion"));
		lustrador.lustrarInstrumento(new InstrumentoVientoMetal("metal", "instrumento de viento de metal"));

		afinador.afinarInstrumento(new InstrumentoCuerda("cuerda2", "instrumento de cuerda"));
		afinador.afinarInstrumento(new InstrumentoVientoMetal("metal", "instrumento de viento de metal"));

		concierto.tocarTodosLosInstrumentos();
		
		concierto.tocarInstrumentosDeCuerda();
		concierto.tocarInstrumentosDeViento();
		concierto.tocarInstrumentosDePercusion();
	}


}
