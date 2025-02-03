package src.dennis.programas.exercicios.aula20;

import java.util.Scanner;

public class Exer003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrizM = new int[3][3];
        int contaPares = 0;
        int contaImpares = 0;

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.println("Digite o valor da matriz na linha [" + i + "] e na coluna [" + j + "]");
                matrizM[i][j] = sc.nextInt();

                if (matrizM[i][j] % 2 == 0) {
                    contaPares ++;
                } else {
                    contaImpares ++;
                }
            }
        }

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) { 
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println();     
        }

        System.out.println("Quantidade de pares " + contaPares);
        System.out.println("Quantidade de ímpares " + contaImpares);
        sc.close();
    }
}
