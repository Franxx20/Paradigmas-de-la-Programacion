package edu.unlam.paradigmas.excepciones.ej04;

import edu.unlam.paradigmas.excepciones.ej03.RuntimeExceptionNumero;

public class Main {
    public static void main(String[] args) {
//        try {
//            Cuenta cuenta1 = new Cuenta(-1);
//        } catch (RuntimeExceptionNumero e) {
//            e.printStackTrace();
//        }


        Cuenta cuenta2 = new Cuenta(200);
        try {
            cuenta2.retirarSaldo(2000);
        } catch (RuntimeExceptionNumero e) {
            e.printStackTrace();
        }

        try {
            cuenta2.depositarSaldo(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
