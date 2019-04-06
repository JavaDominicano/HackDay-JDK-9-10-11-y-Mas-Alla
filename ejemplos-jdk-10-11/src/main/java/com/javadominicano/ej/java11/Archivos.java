package com.javadominicano.ej.java11;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Archivos {

    public static void main(String[] args) throws Exception {
        File temporal = File.createTempFile("archivo", ".tmp");
        Path p = Paths.get(temporal.toURI());
        System.out.println("La ruta del archivo: "+p.toString());

        //Escribiendo las listas
        Files.writeString(p, "Hola Mundo en nuestro Java Day :-D");

        //Leyendo el archivo.
        var listas = Files.readAllLines(p);
        listas.forEach(System.out::println);
    }
}
