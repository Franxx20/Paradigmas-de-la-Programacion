package edu.unlam.paradigmas.excepciones.ej07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Archivo {
    public void leerArchivo(String nombreArchivo) {
        try (Scanner scanner = new Scanner(new File(nombreArchivo))) {
            if (scanner.hasNext()) {
                String archivoInterno = scanner.nextLine();

                try (Scanner scannerInterno = new Scanner(new File(archivoInterno))) {
                    scannerInterno.close();
                    System.out.println("se abrio exisotasamente el archivo hijo");
                } catch (FileNotFoundException | NullPointerException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (NullPointerException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo(String nombrePadre, String nombreHijo) {
        File archivoPadre = new File(nombrePadre);

        try {
            if (archivoPadre.createNewFile()) {
                System.out.println("Archivo padre creado" + archivoPadre.getName());
            } else {
                System.out.println("El archivo padre ya existe");
            }

            try (FileWriter escritor = new FileWriter(nombrePadre)) {
                escritor.write(nombreHijo);
                System.out.println("se escribio el nombre del hijo exitosamente");
                File archivoHijo = new File(nombreHijo);
                try {
                    if (archivoHijo.createNewFile()) {
                        System.out.println("Archivo hijo creado" + archivoHijo.getName());
                    } else {
                        System.out.println("El archivo hijo ya existe");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo padre");
            e.printStackTrace();
        }

    }

}
