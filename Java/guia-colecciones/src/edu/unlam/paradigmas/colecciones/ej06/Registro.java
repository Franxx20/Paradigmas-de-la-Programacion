package edu.unlam.paradigmas.colecciones.ej06;

import java.util.*;
import java.util.stream.*;

public class Registro {
    private HashMap<String, ArrayList<Double>> alumnos;

    public Registro() {
        this.alumnos = new HashMap<String, ArrayList<Double>>();
    }

    public void agregarAlumnos(String nombre, ArrayList<Double> notas) {
        this.alumnos.merge(nombre, notas, Registro::acumularListasNotas);

    }

    public double obtenerPromedio(String nombreAlumno) {
        return this.alumnos.get(nombreAlumno).stream().mapToDouble(Double::doubleValue).average().orElseThrow(IllegalStateException::new);

    }

    static ArrayList<Double> acumularListasNotas(ArrayList<Double> notas1, ArrayList<Double> notas2) {
        return (ArrayList<Double>) Stream.of(notas1, notas2).flatMap(x -> x.stream()).collect(Collectors.toList());
    }

    static ArrayList<String> acumularListasAlumnos(ArrayList<String> alumnos1, ArrayList<String> alumnos2) {
        return (ArrayList<String>) Stream.of(alumnos1, alumnos2).flatMap(x -> x.stream()).collect(Collectors.toList());
    }


    @Override
    public String toString() {
        return "Registro{" + "alumnos=" + alumnos + '}';
    }

    public HashMap<Double, ArrayList<String>> alumnosSegunNotas() {

        HashMap<Double, ArrayList<String>> mapaInvertido = new HashMap<>();
        for (Map.Entry<String, ArrayList<Double>> entry : this.alumnos.entrySet()) {
            mapaInvertido.merge(entry.getValue().stream().mapToDouble(Double::doubleValue).average().orElseThrow(IllegalStateException::new), new ArrayList<String>(Arrays.asList(entry.getKey())), Registro::acumularListasAlumnos);
        }

        return mapaInvertido;
    }
}
