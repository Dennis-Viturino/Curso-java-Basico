package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro");
        int num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("Este número é par");
        } else {
            System.out.println("Este número é ímpar");
        }
    }
}