package edu.unlam.paradigmas.herencia.ej01;

public class Estudiante extends Persona {
    @Override
    public void saludar() {
        System.out.println("Hola soy un estudiante");
    }

    public void darPresente() {
        System.out.println("Doy presente!");
    }
}
