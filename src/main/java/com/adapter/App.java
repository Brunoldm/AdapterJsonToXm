package com.adapter;

public class App {
    public static void main(String[] args) {
        // Modelo de entrada JSON
        String jsonInput = """
            {
              "id": 1,
              "nome": "Bruno",
              "valor": 150.75
            }
        """;

        // Adapter converte JSON para XML
        String xml = XmlAdapter.converterJsonParaXml(jsonInput);

        // Backend "interpreta" e imprime o XML
        BackendSystem.processarXML(xml);
    }
}
