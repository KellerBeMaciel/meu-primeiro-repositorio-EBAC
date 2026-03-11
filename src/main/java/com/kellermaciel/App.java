package com.kellermaciel;

import java.util.Scanner;

public class App
{

    static Scanner scanner;

    public static void main( String[] args ) {
        scanner =  new Scanner(System.in);

        int numero = getNumeroInteiroPositivo();
        imprimirTabuada(numero);

        iniciarPrograma();
        scanner.close();
    }

    public static void iniciarPrograma() {
        do {
            System.out.println( "Opção 1: Continuar. \n" +
                                "Opção 2: Sair.");

            int selecao = 0;
            String input = scanner.nextLine();

            try {
                selecao = Integer.parseInt(input);
            } catch (Exception e){
                System.out.println("Entrada " + input + " é inválida.");
                continue;
            }

            switch (selecao) {
                case 1:
                    repetirFrase();
                    break;
                case 2:
                    System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (true);
    }

    public static void repetirFrase(){
        System.out.println("Digite o que quiser! ");
        String input = scanner.nextLine();

        System.out.println("$ " + input);
    }

    public static int getNumeroInteiroPositivo(){
        do{
            System.out.println("Digite um número inteiro:");
            int input = scanner.nextInt();
            scanner.nextLine();

            if(input > 0) return input;

            System.out.println("O número " + input + " é inválido, informe um número positivo maior que 0.");
        } while(true);
    }

    public static void imprimirTabuada(int numeroInformado){
        System.out.println("== Tabuada de " + numeroInformado + " ==");
        int multiplicador = 1;
        int resultado = 0;

        while(multiplicador <= 10){
            resultado = resultado + numeroInformado;
            System.out.println(numeroInformado + " \tx " + multiplicador + " \t= " + resultado);
            multiplicador++;
        }
    }
}
