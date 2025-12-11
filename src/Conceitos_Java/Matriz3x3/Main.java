package Conceitos_Java.Matriz3x3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Crie um programa que preencha uma matriz 3x3 com números inteiros fornecidos pelo usuário.
        Em seguida, calcule e exiba a soma de todos os elementos da matriz e a soma de cada linha.*/

        int[][] matriz = new int[3][3];
        int[] somaLinhas = new int[3];
        int somaTotal = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores para a matriz 3x3: ");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();

                somaTotal += matriz[linha][coluna];
                somaLinhas[linha] += matriz[linha][coluna];
            }
        }

        System.out.println("Soma total dos elementos: " + somaTotal);
        System.out.println("\n-------------------------------\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("Soma da linha " + i + ": " + somaLinhas[i]);
        }

        System.out.println("\n-------------------------------\n");

        scanner.close();
    }
}
