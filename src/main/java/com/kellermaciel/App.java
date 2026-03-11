package com.kellermaciel;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings!");

        System.out.print("Informe um número inteiro: ");
        int primeiroNumero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Agora, informe um segundo número inteiro: ");
        int segundoNumero = scanner.nextInt();
        scanner.nextLine();

        if(primeiroNumero > segundoNumero) {
            System.out.println("O maior número é: " + primeiroNumero);
        } else if (segundoNumero > primeiroNumero) {
            System.out.println("O maior número é: " + segundoNumero);
        } else {
            System.out.println("Os números são iguais!");
        }

        scanner.close();
    }
}
