package edu.unlam.paradigmas.excepciones.ej03;

public class RuntimeExceptionNumero extends RuntimeException {
    private String mensaje;
    public RuntimeExceptionNumero(String mensaje){
        super(mensaje);
    }
    public RuntimeExceptionNumero(){
        super();
    }
}
