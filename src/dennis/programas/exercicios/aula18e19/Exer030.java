package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer030 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length]; // pares
        int[] vetorC = new int[vetorA.length]; // impares
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com o calor do vetor A na posição " + i);
            vetorA[i] = sc.nextInt();

            if (vetorA[i] % 2 == 0) {
                vetorB[pares] = vetorA[i];
                pares++; 
            } else {
                vetorC[impares] = vetorA[i];
                impares++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < pares; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println(); 

        System.out.print("Vetor C = ");
        for (int i = 0; i < impares; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println(); 

    }
}
