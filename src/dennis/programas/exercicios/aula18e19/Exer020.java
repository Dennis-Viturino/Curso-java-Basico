package src.dennis.programas.exercicios.aula18e19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer020 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        System.out.println("Digite a cotação do Dolar");
        cotacao = sc.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i+1);
        }

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("Vetor A =");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(df.format(vetorA[i]) + " ");
        }
        System.out.println();
        sc.close();
    }
}
