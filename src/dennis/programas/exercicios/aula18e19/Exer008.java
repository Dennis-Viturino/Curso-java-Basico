package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer008 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do Vetor A na posição " + (i + 1));
            vetorA[i] = sc.nextInt();
        }
        
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite o valor do Vetor B na posição " + (i + 1));
            vetorB[i] = sc.nextInt();
        }
        
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
        }

        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        sc.close();
    }
}
