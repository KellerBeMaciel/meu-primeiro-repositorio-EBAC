package com.kellermaciel;

public class Carro {
    public static double valoresTotal = 0.0;
    private String nome;
    private double valor;
    private String modelo; // esportivo | classico | luxo
    private String marca;

    public Carro(String nome, String modelo, String marca, double valor){
        this.nome = nome;
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
        valoresTotal += valor;
    }

    public String getNome() {
        return nome;
    }
}
