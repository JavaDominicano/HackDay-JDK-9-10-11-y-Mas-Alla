package com.javadominicano.ej.java10;

import java.util.ArrayList;
import java.util.List;

public class InferenciasTipos {

    //puedo utilizar el tipo var.
    //var objeto = 1; debe ser usado en el contexto local.

    public InferenciasTipos(){

        ejemploBasico();

        ejemploLambdasVar();
    }

    /**
     * 
     */
    private void ejemploBasico() {
        var entero = 10;
        System.out.println("El valor de la variable: "+entero);
        //una vez declarada no puedo cambiarlo.
        //entero = "Otro valor"; //no es compatible.
        var lista = new ArrayList<String>();
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("En");
        lista.add("Java");

        //iterando...
        for(String s : lista){
            System.out.println(s);
        }
    }

    /**
     * Incluyendo en la versión 11.
     */
    private void ejemploLambdasVar(){

        var lista = List.of(12, 23,41,45); //son inmutables por el of.

        lista.forEach((var a) ->{  //no puedo mezclar los tipos...
            int suma = a + 2;
            System.out.println("La suma: "+suma);
        });
    }



    public static void main(String[] args) {
        new InferenciasTipos();
    }
}
