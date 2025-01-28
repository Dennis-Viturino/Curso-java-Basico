package src.dennis.programas.exercicios.aula18e19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double[] vetorA = new double[10];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i< vetorA.length; i++) {
            System.out.println("Digite o valor do vetor A na posição " + (i));
            vetorA[i] = sc.nextDouble();

            vetorB[i] = vetorA[i] % 2;
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(df.format(vetorB[i]) + " ");
        }
        System.out.println();

    }
}
