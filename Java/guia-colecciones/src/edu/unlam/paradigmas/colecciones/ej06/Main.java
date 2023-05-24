package edu.unlam.paradigmas.colecciones.ej06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Registro registro = new Registro();

        ArrayList<Double> nota1 = new ArrayList<>(Arrays.asList(7.0, 4.0, 9.0));
        ArrayList<Double> nota2 = new ArrayList<>(Arrays.asList(9.0, 5.0, 10.0));
        ArrayList<Double> nota3 = new ArrayList<>(Arrays.asList(4.0, 5.0, 6.0));

        registro.agregarAlumnos("jose", nota1);
        System.out.println(registro.obtenerPromedio("jose"));
        registro.agregarAlumnos("jose", nota2);
        System.out.println(registro.obtenerPromedio("jose"));

        registro.agregarAlumnos("pablo",nota3);

        registro.agregarAlumnos("martin",nota1);
        registro.agregarAlumnos("martin",nota2);


        System.out.println(registro);

        System.out.println("\nAlumnos segun notas "+ registro.alumnosSegunNotas());
    }
}
