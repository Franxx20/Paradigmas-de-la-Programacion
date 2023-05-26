package edu.unlam.paradigmas.excepciones.ej02;

public class Main {
    public static void main(String[] args) {
        double numero = -1;
        double resultado = Main.raizCuadrada(numero);

        try {
            System.out.println(String.format("La raiz cuadrada de %f es %f", numero, resultado));
        } catch (ExcepcionRaiz e) {
            e.printStackTrace();
        }

    }

    public static double raizCuadrada(double numero) {
        if (numero < 0)

            throw new ExcepcionRaiz("El numero no puede ser negativo");

        return Math.sqrt(numero);
    }

}

