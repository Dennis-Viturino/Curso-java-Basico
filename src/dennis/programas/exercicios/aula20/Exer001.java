package src.dennis.programas.exercicios.aula20;

import java.util.Random;
import java.util.Scanner;

public class Exer001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] numerosAleatorios = new int[4][4];

        Random numroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numroRandom.nextInt(10);
            }
        }

        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (numerosAleatorios[i][j] > maior) {
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println("coluna = " + coluna);
        sc.close();
    }
}
