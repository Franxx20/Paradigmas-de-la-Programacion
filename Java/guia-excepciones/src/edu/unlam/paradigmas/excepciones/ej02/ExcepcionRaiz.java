package edu.unlam.paradigmas.excepciones.ej02;

public class ExcepcionRaiz extends RuntimeException {
    String mensaje;

    public ExcepcionRaiz(String mensaje) {
        super(mensaje);
    }

    public ExcepcionRaiz() {
        super();
    }

}
