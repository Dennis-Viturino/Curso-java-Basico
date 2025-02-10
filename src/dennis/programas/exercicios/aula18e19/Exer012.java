package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetor A na posição " + (i));
            vetorA[i] = sc.nextInt();

            soma += vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("A soma de todos os elementos do vetor A é: " + soma);
        sc.close();
    }
}
