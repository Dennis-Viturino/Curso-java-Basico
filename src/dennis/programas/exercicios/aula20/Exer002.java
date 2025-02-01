package src.dennis.programas.exercicios.aula20;

import java.util.Random;
import java.util.Scanner;

public class Exer002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random numeroRandom = new Random();

        int[][] numerosAleatorios = new int[10][10];

        int maiorDaLinha5 = Integer.MIN_VALUE;
        int menorDaLinha5 = Integer.MAX_VALUE;
        int linha5 = 5;

        int maiorDaColuna7 = Integer.MIN_VALUE;
        int menorDaColuna7 = Integer.MAX_VALUE;
        int coluna7 = 7;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(10);
            }
        }

        // imprimir uma matriz é assim
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < numerosAleatorios[linha5].length; i++) {
            if (numerosAleatorios[linha5][i] > maiorDaLinha5) {
                maiorDaLinha5 = numerosAleatorios[linha5][i];
            }
            if (numerosAleatorios[linha5][i] < menorDaLinha5) {
                menorDaLinha5 = numerosAleatorios[linha5][i];
            }
        }

        System.out.println("Maior valor da linha 5 é o " + maiorDaLinha5);
        System.out.println("Menor valor da linha 5 é o " + menorDaLinha5);

        for (int i = 0; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i][coluna7] > maiorDaColuna7) {
                maiorDaColuna7 = numerosAleatorios[i][coluna7];
            }
            if (numerosAleatorios[i][coluna7] < menorDaColuna7) {
                menorDaColuna7 = numerosAleatorios[i][coluna7];
            }
        }

        System.out.println("Maior valor da coluna 7 é o " + maiorDaColuna7);
        System.out.println("Menor valor da coluna 7 é o " + menorDaColuna7);

    }
}
