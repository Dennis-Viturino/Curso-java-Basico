package src.dennis.programas.exercicios.aula1a13;

import java.util.Scanner;

public class Exer011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 numeros inteiros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Digite um número real agora");
        double num3 = sc.nextDouble();

        System.out.println("Letra a: " + ((num1 * 2) * (num2/2)));
        System.out.println("Letra b: " + ((num1 * 3) + num3));
        System.out.println("Letra c: " + (Math.pow(num3, 3)));
    }
}
