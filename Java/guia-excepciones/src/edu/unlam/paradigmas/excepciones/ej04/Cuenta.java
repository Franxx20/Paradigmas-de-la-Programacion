package edu.unlam.paradigmas.excepciones.ej04;

import edu.unlam.paradigmas.excepciones.ej02.ExcepcionRaiz;
import edu.unlam.paradigmas.excepciones.ej03.RuntimeExceptionNumero;

public class Cuenta {
    double saldo;

    public Cuenta(){
        saldo = 0;
    }
    public Cuenta(double saldo){
        if(saldo <0 ){
            throw new RuntimeExceptionNumero("El saldo inicial no puede ser negativo!");
        }
        this.saldo = 0;
    }

    public void depositarSaldo(double saldo)throws Exception {
        if(saldo<0){
            throw new Exception("El saldo a depositar no puede ser negativo!");

        }
        this.saldo+=saldo;
    }

    public void retirarSaldo(double saldo){
        if(saldo > this.saldo){
            throw new RuntimeExceptionNumero("El saldo a retirar no puede ser mayor al saldo disponible!");
        }
        this.saldo-=saldo;
    }

}
