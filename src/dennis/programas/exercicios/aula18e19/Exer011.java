package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer011 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorPares;
        int qtdPares = 0;

        for (int i=0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetor A na posição " + i);
            vetorA[i] = sc.nextInt();

            if (vetorA[i] % 2 == 0) {
                qtdPares += 1;
            }
        }

        vetorPares = new int[qtdPares];
        for (int i = 0, j = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorPares[j] = vetorA[i];
                j++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor de Pares = ");
        for (int i = 0; i < vetorPares.length; i++) {
            System.out.print(vetorPares[i] + " ");
        }
        System.out.println();
        
        System.out.println("A quantida de elementos pares é " + qtdPares);
        sc.close();
    }
}
