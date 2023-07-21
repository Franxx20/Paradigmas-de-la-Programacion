package edu.unlam.paradigmas.colecciones.ej07;

public class Main {
    public static void main(String[] args) {
        Administrador administrador = new Administrador();



        administrador.agregarTarea(new Tarea(1,"tarea 1"));
        administrador.agregarTarea(new Tarea(2,"tarea 2"));
        administrador.agregarTarea(new Tarea(3,"tarea 3"));
        administrador.agregarTarea(new Tarea(4,"tarea 4"));

        administrador.ordenInverso();

        administrador.realizarTarea();
        administrador.realizarTarea();
        administrador.realizarTarea();
        administrador.realizarTarea();
        administrador.realizarTarea();
    }
}
