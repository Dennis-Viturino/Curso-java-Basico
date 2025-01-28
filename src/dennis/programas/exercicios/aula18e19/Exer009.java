package src.dennis.programas.exercicios.aula18e19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer009 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do Vetor A na posição " + (i + 1));
            vetorA[i] = sc.nextInt();
        }
        
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite o valor do Vetor B na posição " + (i + 1));
            vetorB[i] = sc.nextInt();
        }
        
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] / vetorB[i];
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

        DecimalFormat formatando = new DecimalFormat("###,###.##");

        System.out.print("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(formatando.format(vetorC[i]) + " ");
        }
        System.out.println();
    }
}
