package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número:");
        int num1 = sc.nextInt();

        System.out.println("Entre com o segundo número:");
        int num2 = sc.nextInt();

        System.out.println("Entre com a operação (+ - * /)");
        String operacao = sc.next();

        double resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case "+": resultado = (num1 + num2); break;
            case "-": resultado = (num1 - num2); break;
            case "*": resultado = (num1 * num2); break;
            case "/": resultado = (num1 / num2); break;
            default: System.out.println("Não é uma operação válida"); valida = false;
        }
        
        if (valida) {
            if (resultado < 0) {
                System.out.println("O resultado é negativo: " + resultado);
            } else {
                System.out.println("O resultado é positivo: " + resultado);
            }

            if (resultado % 2 == 0) {
                System.out.println("É um número par");
            } else {
                System.out.println("É um número ímpar");
            }
        }
    }
}