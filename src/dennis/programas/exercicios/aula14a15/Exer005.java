package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7 && media != 10) {
            System.out.println("Aprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media < 7) {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
