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

        StringBuilder builder = new StringBuilder();

        builder.append("============================================================================\n");
        builder.append(String.format("Nome Completo: %s \n", nome));
        builder.append(String.format("CPF:: %s          \n", cpf));
        builder.append(String.format("Idade: %d         \n", idade));
        builder.append(String.format("Peso: %f          \n", peso));
        builder.append(String.format("Altura: %f        \n", altura));
        builder.append(String.format("Estado Civil: %s  \n", estadoCivil));
        builder.append("============================================================================\n");

        System.out.println(builder.toString());
        scanner.close();

    }
}
