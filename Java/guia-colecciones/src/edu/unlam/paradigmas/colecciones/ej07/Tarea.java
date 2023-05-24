package edu.unlam.paradigmas.colecciones.ej07;

public class Tarea implements Comparable<Tarea> {
    private int nroTarea;

    public Tarea(int nroTarea, String descripcion) {
        this.nroTarea = nroTarea;
        this.descripcion = descripcion;
    }

    public int getNroTarea() {
        return nroTarea;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nroTarea=" + nroTarea +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public String getDescripcion() {
        return descripcion;
    }

    String descripcion;

    @Override
    public int compareTo(Tarea tarea) {
        return Integer.compare(this.getNroTarea(), tarea.getNroTarea());
    }
}
