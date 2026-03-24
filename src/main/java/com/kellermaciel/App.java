package com.kellermaciel;

import java.util.Scanner;

public class App
{
    static Scanner scanner;

    public static void main( String[] args )
    {
        int[][] matriz = new int[3][3];
        scanner = new Scanner(System.in);
        System.out.println("Iremos preencher agora uma matriz 3x3, por favor, informe 9 números: ");

        popularMatriz(matriz, 3, 3);
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] matriz){
        for(int [] vetor : matriz){
            System.out.printf("%d %d %d", vetor[0], vetor[1], vetor[2]);
            System.out.println();
        }
    }

    public static void popularMatriz(int[][] matriz, int linhas, int colunas){
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.printf("Informe o número para a posição [%d][%d]: ", i, j);
                matriz[i][j] = getNextInt();
            }
        }
    }

    public static int getNextInt(){
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }
}
