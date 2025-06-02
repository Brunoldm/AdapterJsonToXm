package com.adapter;

// Classe que representa os dados da transação
public class JsonInput {
    public int id;
    public String nome;
    public double valor;

    // Construtor vazio exigido pelo Jackson
    public JsonInput() {}

    public JsonInput(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }
}
