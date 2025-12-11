package Conceitos_Java.ListStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*Crie um programa que receba uma lista de números inteiros do usuário e use streams para:
        Filtrar os números ímpares.
        Dobrar os valores dos números ímpares.
        Ordenar os números resultados em ordem crescente.
        Exibir a lista final.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você quer inserir? ");
        int quantidade = scanner.nextInt();
        
        List<Integer> numeros = new ArrayList<>();
        
        System.out.println("Digite os " + quantidade + " números inteiros:");
        for (int i = 0; i < quantidade; i++) {
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        List<Integer> resultado = numeros.stream()
            .filter(n -> n % 2 != 0) // Filtrar ímpares
            .map(n -> n * 2) // Dobrar
            .sorted() // Ordenar
            .collect(Collectors.toList()); // Coletar em lista

        System.out.println("Lista final: " + resultado);

        scanner.close();
    }
}
