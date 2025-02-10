package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de n");
        int n =sc.nextInt();
        double soma = 0;

        for(int i = 1, j = 1; i <= n; i++, j+=2) {

            System.out.print(i + "/" + j + " + ");

            soma += i / j;
        }

        System.out.println("\nSoma = " + soma);
        sc.close();
    }
}
