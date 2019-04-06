package com.javadominicano.ej.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Se incorpora un cliente para la versión HTTP 1 y HTTP 2
 */
public class ClienteHttp {


    public ClienteHttp(){

    }

    public static void main(String[] args) throws Exception {
        //
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/get"))
                .GET()
                .build();


        //
        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        //
        System.out.println("Los Headers: ");
        var mapaHeader = response.headers().map();
        mapaHeader.forEach((k, v) -> System.out.println(String.format("\tHEADER[%s] = %s", k, v.get(0))));

        System.out.println("\nEl cuerpo de la llamada: "+response.body());
    }
}
