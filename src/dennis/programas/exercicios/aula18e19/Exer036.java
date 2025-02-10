package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer036 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double[] vetorA = new double[11];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Math.pow(2, i);
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
