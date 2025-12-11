package LogicaDeProgramacao.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double resultado;

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o operador: +, -, *, /");
        char op = scanner.next().charAt(0);

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        switch (op) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}