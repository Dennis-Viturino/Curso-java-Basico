package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Entre com um número");
            num = sc.nextInt();

            if (num > maior) {
                maior = num;
                System.out.println("O número maior mudou para: " + maior);
            }
        }

        System.out.println("O maior número é: " + maior);
        sc.close();
    }
}
