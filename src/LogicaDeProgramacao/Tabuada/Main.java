package LogicaDeProgramacao.Tabuada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro para obter a sua tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("\nTabuada do número " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }

        scanner.close();
    }
}
