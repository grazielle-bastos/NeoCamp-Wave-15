package LogicaDeProgramacao.VerificaParImpar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String verificaNumero = (numero % 2 == 0) ? "par": "impar";
        System.out.println("O número " + numero + " é " + verificaNumero);

    }
}
