package edu.unlam.paradigmas.colecciones.ej07;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class Administrador {
    Queue<Tarea> colaDeTareas;

    public Administrador() {
        this.colaDeTareas = new LinkedList<>();
    }

    public void agregarTarea(Tarea tarea) {
        this.colaDeTareas.add(tarea);
    }

    public void realizarTarea() {
        System.out.println(this.colaDeTareas.peek() != null ? "Se realiza la tarea " + this.colaDeTareas.poll() : "no hay mas tareas disponibles");
    }

    public void ordenInverso(){
//        this.colaDeTareas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
//        this.colaDeTareas.stream().collect(Collections.reverse());
        Collections.reverse((List<?>) this.colaDeTareas);
        System.out.println(this.colaDeTareas);
    }
}
