package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer037 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Digite o valor do Vetor A na posição - " + i);
            vetorA[i] = sc.nextInt();
        }

        for (int i = 1; i < vetorA.length; i++) {

            vetorB[i] = 1;
            for (int j = 1; j <= vetorA[i]; j++) {
                vetorB[i] *= j;
            }
        }


        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println(); 
    }
}
