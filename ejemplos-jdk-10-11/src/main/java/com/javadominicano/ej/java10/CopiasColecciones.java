package com.javadominicano.ej.java10;

import java.util.ArrayList;
import java.util.List;

public class CopiasColecciones {

    public CopiasColecciones(){
        List lista = new ArrayList<String>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        //aplicando la copia.
        List<String> copia = List.copyOf(lista); //disponible Set y Map.

        //mostrando.
        System.out.println(lista);
        System.out.println(copia);

        //es inmutable, no puedo cambiarlo.
        //copia.add("otro"); //no funciona, dispara java.lang.UnsupportedOperationException
        
    }

    public static void main(String[] args) {
        new CopiasColecciones();
    }

}
