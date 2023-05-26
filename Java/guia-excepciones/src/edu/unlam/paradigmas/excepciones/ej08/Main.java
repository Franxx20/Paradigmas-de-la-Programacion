package edu.unlam.paradigmas.excepciones.ej08;

public class Main {

    static public double divisionNumerosEnteros(int numerador, int denominador) {
        assert denominador != 0: "El denominador no debe ser un numero igual a cero";

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
