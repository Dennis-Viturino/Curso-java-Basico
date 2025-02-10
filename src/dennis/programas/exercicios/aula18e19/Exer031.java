package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer031 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int posicaoB = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o calor do vetor A na posição " + i);
            vetorA[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[posicaoB] = vetorA[i];
                posicaoB++; 
            }
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                vetorB[posicaoB] = vetorA[i];
                posicaoB++; 
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < posicaoB; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println(); 
        sc.close();
    }
}
