package edu.unlam.paradigmas.excepciones.ej03;

public class Main {
    public static void main(String[] args) {
        double resultado = Main.divisionNumerosEnteros(10, 0);
        try {
            System.out.println(String.format("El resultado es %.02f", resultado));
        } catch (RuntimeExceptionNumero e) {
            e.printStackTrace();
        }
    }
    static public double divisionNumerosEnteros(int numerador, int denominador) throws RuntimeExceptionNumero{
        if (denominador == 0) {
            throw new RuntimeExceptionNumero("El denominador no puede ser cero!");
        }

        return (double)numerador / denominador;
    }
}
