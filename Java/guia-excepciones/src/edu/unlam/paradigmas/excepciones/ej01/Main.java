package edu.unlam.paradigmas.excepciones.ej01;

public class Main {

    static public double divisionNumerosEnteros(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("Denominador no puede ser cero!");
        }

        return (double)numerador / denominador;
    }

    public static void main(String[] args) {
        double resultado = Main.divisionNumerosEnteros(10, 0);

        try {
            System.out.println(String.format("El resultado es %.02f", resultado));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
