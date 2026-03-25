package com.kellermaciel;

import java.util.Scanner;

public class App
{
    static Scanner scanner;

    public static void main( String[] args ) {
        scanner = new Scanner(System.in);
        int quantidade;

        do {
            System.out.println("Quantos carros deseja criar?");
            quantidade = scanner.nextInt();
            scanner.nextLine();

            if(quantidade > 0 && quantidade <= 50){
                break;
            }

            System.out.println("Quantidade válida: " + quantidade + ". Informe uma quantidade entre 1 e 50.");

        } while (true);



        Carro[] carros = criarCarros(quantidade);

        System.out.println("\n=== Informações dos Carros===\n");

        System.out.println("Carros criados:");
        for(Carro carro : carros){
            System.out.println(carro.getNome());
        }

        System.out.println("Quantidade total de carros: " + quantidade);
        System.out.println("Valor total dos carros: " + Carro.valoresTotal);


        scanner.close();
    }

    public static Carro[] criarCarros(int quantidade) {
        Carro[] carros = new Carro[quantidade];
        scanner = new Scanner(System.in);

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\n=== Informações do Carro ===");

            System.out.println("Digite o nome do carro:");
            String nome = scanner.nextLine();
            System.out.println("Digite o modelo do carro (esportivo | classico | luxo):");
            String modelo = scanner.nextLine();
            System.out.println("Digite a marca do carro:");
            String marca = scanner.nextLine();
            System.out.println("Digite o valor do carro:");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha

            carros[i] = new Carro(nome, modelo, marca, valor);
        }

        return carros;
    }

}
