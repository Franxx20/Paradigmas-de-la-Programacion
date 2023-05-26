package edu.unlam.paradigmas.excepciones.ej07;

import edu.unlam.paradigmas.excepciones.ej06.Archivo;

public class Main {
    public static void main(String[] args) {
        edu.unlam.paradigmas.excepciones.ej06.Archivo archivo = new Archivo();

        archivo.escribirArchivo("archivoPadre.txt","archivoHijo.txt");
        archivo.leerArchivo("archivoPadre.txt");

    }
}
