package edu.unlam.paradigmas.excepciones.ej06;

public class Main {
    public static void main(String[] args) {
        Archivo archivo = new Archivo();

        archivo.escribirArchivo("archivoPadre.txt","archivoHijo.txt");
        archivo.leerArchivo("archivoPadre.txt");

    }
}
