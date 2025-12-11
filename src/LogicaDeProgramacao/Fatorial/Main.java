package LogicaDeProgramacao.Fatorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*O fatorial de um número n (n pertence ao conjunto dos números naturais) é sempre o produto de todos os seus antecessores, incluindo si próprio e excluindo o zero.
        n >= 0 (n maior ou igual a zero) , ou seja, não existe fatorial para números negativos.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro, não negativo para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Não existe fatorial para números negativos.");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial do número " + numero + " é " + fatorial);
        }

        scanner.close();
    }
}
