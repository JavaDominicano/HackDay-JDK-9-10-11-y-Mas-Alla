package com.javadominicano.ej.java11;

public class CambiosString {

    public CambiosString(){

        var cadena = "Hola Mundo ";
        var resultado = cadena.repeat(2); // presenta Hola Mundo Hola Mundo.
        System.out.println(resultado);

        //si aplico el valor cero, tengo un String vacio.
        var r1 = cadena.repeat(0);
        System.out.println("La cadena: "+r1);

        //Se agrego la instrucción es en blanco.
        var esEnBlanco = " ".isBlank(); // true
        System.out.println("Es en blanco: "+esEnBlanco);

        //eliminando los espacios a la derecha y izquierda.
        var r2 = "    Hol a    ".strip().equalsIgnoreCase("Hol a");
        System.out.println(r2);

        //eliminando los espacios a la derecha.
        var r3 = "    Hol a ".stripLeading().equalsIgnoreCase("Hol a ");
        System.out.println(r3);

        //eliminando los espacios a la izquierda.
        var r4 = " Hol a      ".stripTrailing().equalsIgnoreCase(" Hol a");
        System.out.println(r4);

        //recorriendo las lineas
        "Hola\nMundo\nEn\nJava".lines().forEach(System.out::println);
    }

    public static void main(String[] args) {
        new CambiosString();
    }
}
