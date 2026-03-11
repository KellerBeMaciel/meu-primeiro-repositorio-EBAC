package com.kellermaciel;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings! \nTemos algumas perguntas para você. \nVamos Começar!");

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu CPF:");
        String cpf = scanner.nextLine();

        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite seu Estado Civil: ");
        String estadoCivil = scanner.nextLine();

        System.out.println("\nObrigado pela sua participação, dados registrados: ");

        String dados =  "============================================================================\n" +
                        String.format("Nome Completo: %s \n", nome) +
                        String.format("CPF:: %s          \n", cpf) +
                        String.format("Idade: %d         \n", idade) +
                        String.format("Peso: %f          \n", peso) +
                        String.format("Altura: %f        \n", altura) +
                        String.format("Estado Civil: %s  \n", estadoCivil) +
                        "============================================================================\n";

        System.out.println(dados);
        scanner.close();

    }
}
