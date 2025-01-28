package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer017 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtdPessoasAcima = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do vetorA na posição " + (i + 1));
            vetorA[i] = sc.nextInt();

            if (vetorA[i] > 35) {
                qtdPessoasAcima ++;
            }
        }

        System.out.print("Vetor A = ");
        for ( int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("A quantidade de pessoas com idade superior a 35 é de " + qtdPessoasAcima + " pessoas");

    }
}
