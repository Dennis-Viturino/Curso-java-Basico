package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de a b e c seprados por espaços");
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau"); 
        } else {
            int b = sc.nextInt();
            int c = sc.nextInt();
            double delta = Math.pow(b, 2) - 4 * a * c;
            System.out.println("O valor de delta é: " + delta);

            if (delta < 0) {
                System.out.println("Delta negativo");
            } else if (delta == 0) {
                System.out.println("Delta igual a 0 logo temos uma unica raiz");
                System.out.println((-b + Math.sqrt(delta)) / (2 * a));
            } else {
                System.out.println("Raiz1: " + ((-b + Math.sqrt(delta)) / (2 * a)));
                System.out.println("Raiz2: " + ((-b - Math.sqrt(delta)) / (2 * a)));
            }
        }
    }
}