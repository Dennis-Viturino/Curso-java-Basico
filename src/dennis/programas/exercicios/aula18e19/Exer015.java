package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer015 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int contaPar = 0;
        int contaImpar = 0;
        double percentPar;
        double percentImpar;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do Vetor A na posição " + i);
            vetorA[i] = sc.nextInt();

            if (vetorA[i] % 2 == 0) {
                contaPar += 1;
            } else {
                contaImpar += 1;
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        percentPar = (contaPar * 100) / vetorA.length;
        percentImpar = (contaImpar * 100) / vetorA.length;

        System.out.println("O percentual de pares desse vetor é: " + percentPar + "%");
        System.out.println("O percentual de ímpares desse vetor é: " + percentImpar + "%");
    }
}
