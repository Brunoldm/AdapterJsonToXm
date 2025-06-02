package com.adapter;

public class BackendSystem {

    // Simula o backend que recebe e interpreta XML
    public static void processarXML(String xml) {
        System.out.println("=== XML recebido pelo backend ===");
        System.out.println(xml);
        System.out.println("=== Fim da transação ===");
    }
}
