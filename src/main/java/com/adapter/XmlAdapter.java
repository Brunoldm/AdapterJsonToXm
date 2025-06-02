package com.adapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlAdapter {

    // Método que recebe um JSON, converte para objeto e depois para XML
    public static String converterJsonParaXml(String json) {
        try {
            // Converte JSON em objeto Java
            ObjectMapper jsonMapper = new ObjectMapper();
            JsonInput obj = jsonMapper.readValue(json, JsonInput.class);

            // Converte objeto Java em XML
            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.writeValueAsString(obj);

        } catch (Exception e) {
            e.printStackTrace();
            return "<erro>Falha na conversão</erro>";
        }
    }
}
