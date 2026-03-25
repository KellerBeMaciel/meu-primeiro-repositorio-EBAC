package com.kellermaciel;

import java.util.Scanner;

public class App
{
    static Scanner scanner;

    public static void main( String[] args ) {
        scanner = new Scanner(System.in);
        Aluno[] alunos = cadastrarAlunos();

        System.out.println("\n===== Informações de Alunos Cadastradas =====");
        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }

        scanner.close();
    }

    public static Aluno[] cadastrarAlunos(){
        int quantidade;
        do {
            System.out.println("Quantos alunos deseja cadastrar?");
            quantidade = getNextInt();

            if(quantidade > 0) break;

            System.out.println("Quantidade inválida. Por favor, digite um número maior que zero.");

        } while (true);

        Aluno[] alunos = new Aluno[quantidade];
        for(int i = 0; i < quantidade; i++){
            alunos[i] = cadastrarAluno();
        }

        return alunos;
    }

    public static Aluno cadastrarAluno(){
        System.out.println("===== NOVO ALUNO =====");

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do aluno:");
        int idade = scanner.nextInt();

        Aluno aluno = new Aluno(nome, idade);

        for (int i = 0; i < Aluno.TOTAL_PROVAS_ANO; i++) {
            aluno.setNota(cadastrarNota(i + 1), i);
        }

        return aluno;
    }

    public static double cadastrarNota(int prova){
        double nota;

        do{
            System.out.println("Digite a nota da prova " + prova + ":");
            nota = scanner.nextDouble();
            scanner.nextLine();

            if(nota >= 0.0 && nota <= 10.0) break;

            System.out.println("Nota inválida. Por favor, digite um valor entre 0.0 e 10.0.");
        } while(true);

        return nota;
    }

    public static int getNextInt(){
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }
}
