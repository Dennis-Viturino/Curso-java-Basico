package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um número:");
            num = sc.nextInt();
            if (num % 2 == 0) {
                pares += 1;
            } else {
                impares += 1;
            }
        }
        System.out.println("Foram digitados: " + impares + " números ímpares e " + pares + " números pares");
    }
}
