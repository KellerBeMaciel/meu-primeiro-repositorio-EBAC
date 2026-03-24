package com.kellermaciel;

import java.util.Arrays;
import java.util.Scanner;

public class App
{
    static Scanner scanner;

    public static void main( String[] args ) {
        scanner = new Scanner(System.in);

        System.out.println("=== EXERCICIO 1 ===");
        primeiroExercicio();

        System.out.println("=== EXERCICIO 2 ===");
        segundoExercicio();

        System.out.println("=== EXERCICIO 3 ===");
        terceiroExercicio();

        scanner.close();
    }

    public static void terceiroExercicio(){
        System.out.println("Informe uma palavra ou frase: ");
        String texto = scanner.nextLine();
        texto = texto.trim();
        char[] characteres = texto.toCharArray();

        int controle = (texto.length() / 2) - 1;
        int espelho = texto.length() % 2 == 0? texto.length()/2 : texto.length()/2 + 1;

        while(controle >= 0){
            char aux = characteres[controle];
            characteres[controle] = characteres[espelho];
            characteres[espelho] = aux;

            controle--;
            espelho++;
        }

        System.out.println(String.valueOf(characteres));
    }

    public static void segundoExercicio(){
        int[] vetor = receberVetorInteiros();

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                vetor[i] = vetor[i] * 2;
            } else {
                vetor[i] = (int) Math.pow(vetor[i], 2);
            }
        }

        System.out.println(Arrays.toString(vetor));

    }

    public static void primeiroExercicio(){
        int[] vetor = receberVetorInteiros();
        ordenarVetorCrescente(vetor);
        System.out.println("Números ordenados de forma crescente: " + Arrays.toString(vetor));

        System.out.println("Informe um nome: ");
        String nome = scanner.nextLine();

        contarVogais(nome);
    }

    public static void contarVogais(String texto){
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};

        texto = texto.trim().toLowerCase();

        int contador = 0;

        for(int i = 0; i < vogais.length; i++){
            for(int j = 0; j < texto.length(); j++){
                if(vogais[i] == texto.charAt(j)){
                    contador++;
                }
            }
        }

        System.out.println(texto + " possui " + contador + " vogais");
    }

    public static int[] receberVetorInteiros(){
        int tamanhoVetor;

        do {
            System.out.println("Quantos números deseja informar?");
            tamanhoVetor = getNextInt();

            if(tamanhoVetor <= 0)  System.out.println("Valor Inválido, o vetor deve ter pelo menos 1 (um) de tamanho.");
        } while (tamanhoVetor <= 0);


        int[] vetor = popularVetor(tamanhoVetor);

        return vetor;
    }

    public static void ordenarVetorCrescente(int[] vetor){
        int length = vetor.length;

        int aux;
        for(int i = 0; i < length; i++){
            for(int j = i + 1; j < length; j++){
                if(vetor[j] < vetor[i]){
                     aux = vetor[i];
                     vetor[i] = vetor[j];
                     vetor[j] = aux;
                }
            }
        }
    }

    public static int[] popularVetor(int tam){
        int[] vetor = new int[tam];

        System.out.println("Agora, informe inteiros para preencher o vetor: ");

        for(int i = 0; i < tam; i++){
            vetor[i] = getNextInt();
        }

        return vetor;
    }

    public static int getNextInt(){
        int inteiro = scanner.nextInt();
        scanner.nextLine();
        return inteiro;
    }
}
