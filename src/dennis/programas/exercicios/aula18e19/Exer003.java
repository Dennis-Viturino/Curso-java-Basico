package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer003 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {  
            System.out.println("Digite o valor do vetor A na posição " + (i+1));
            vetorA[i] = sc.nextInt();

            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
