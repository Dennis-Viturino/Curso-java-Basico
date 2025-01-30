package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer029 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length + vetorB.length];

        for (int i = 0, j = 0; i < vetorA.length + vetorB.length; i++) {

            if (i < vetorA.length) {
                System.out.println("Entre com o valor do vetor A na posição " + i);
                vetorA[i] = sc.nextInt();

                vetorC[i] = vetorA[i];

            } else if (i >= vetorA.length && i < vetorA.length + vetorB.length) {
                System.out.println("Entre com o valor do vetor B na posição " + j);
                vetorB[j] = sc.nextInt();

                vetorC[i] = vetorB[j];
                j++; 
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

        System.out.print("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();

    }
}
