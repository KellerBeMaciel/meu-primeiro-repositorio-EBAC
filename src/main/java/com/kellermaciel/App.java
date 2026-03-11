package com.kellermaciel;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int input;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Greetings! \nPor favor, informe o seu nome: ");
        String nome = scanner.nextLine();

        do {
            System.out.print("\nAgora, informe um número inteiro: ");
            input = scanner.nextInt();
            scanner.nextLine();

            if(input > 0) break;

            System.out.println("O número " + input + " é inválido, por favor, informe um inteiro positivo maior que zero.");
        } while (true);

        imprimirContagemCrescente(input);
        imprimirContagemDecrescente(input);
        imprimirNome(nome, input);

        scanner.close();
    }

    public static void imprimirContagemCrescente(int numeroInformado){
        adicionarTitulo("Contagem Crescente");

        for(int i = 0; i <= numeroInformado; i++){
            System.out.print(i + " ");
        }
    }

    public static void imprimirContagemDecrescente(int numeroInformado){
        adicionarTitulo("Contagem Decrescente");

        while(numeroInformado >= 0){
            System.out.print(numeroInformado-- + " ");
        }
    }

    public static void imprimirNome(String nome, int numeroInformado){
        adicionarTitulo("Obrigado!");
        int numerosImpressao = nome.length() > 6 ? numeroInformado : 1;

        for(int i = 0; i < numerosImpressao; i++){
            System.out.println(nome.toUpperCase() + "!");
        }
    }

    public static void adicionarTitulo(String titulo){
        System.out.println("\n===== " + titulo.toUpperCase() + " =====");
    }

}
