package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int somaImpares = 0;
        int contaImpar = 0;
        double media;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetor A na posição " + (i));
            vetorA[i] = sc.nextInt();

            if (vetorA[i] % 2 != 0) {
                contaImpar += 1;
                somaImpares += vetorA[i];
            }
            
        }

        media = somaImpares / contaImpar;

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("A soma de todos os elementos ímpares do vetor A é: " + somaImpares);
        System.out.println("A media dos elementos ímpares do vetor A é: " + media);
    }
}
