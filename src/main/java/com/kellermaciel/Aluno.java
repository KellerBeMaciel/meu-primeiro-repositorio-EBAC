package com.kellermaciel;

import java.util.Arrays;

public class Aluno {
    public static final int TOTAL_PROVAS_ANO = 4;

    private static int matriculaControle = 1000;
    private int matricula;
    private String nome;
    private int idade;
    private double[] notas;

    public Aluno(String nome, int idade){
        this.matricula = ++matriculaControle;
        this.nome = nome;
        this.idade = idade;
        this.notas = new double[TOTAL_PROVAS_ANO];
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setNota(double nota, int prova){
        this.notas[prova] = nota;
    }

    public double getMedia(){
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    @Override
    public String toString(){
        return "Aluno: " +
                "\n   Matricula: " + matricula +
                "\n   Nome: '" + nome + '\'' +
                "\n   Idade: " + idade +
                "\n   Notas: " + Arrays.toString(notas) +
                "\n   Média: " + this.getMedia();

    }

}
