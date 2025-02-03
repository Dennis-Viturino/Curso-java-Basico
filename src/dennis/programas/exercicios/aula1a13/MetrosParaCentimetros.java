package src.dennis.programas.exercicios.aula1a13;

import java.util.Scanner;

public class MetrosParaCentimetros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em metros");
        double metros = sc.nextDouble();
        System.out.println("O valor em centimetros é: " + (metros * 100));
        sc.close();
    }
}
