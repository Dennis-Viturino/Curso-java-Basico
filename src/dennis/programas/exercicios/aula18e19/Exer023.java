package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer023 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        boolean par = true;

        for (int i = 0; i< vetorA.length; i++) {
            System.out.println("Digite o valor do Vetor A na posição " + (i+1));
            vetorA[i] = sc.nextInt();

            if (vetorA[i] % 2 != 0) {
                par = false;
                break;
            }
        }

        if (par) {
            System.out.println("Todos os elementos do vetor A são pares");
            System.out.print("Vetor A = ");
            for (int i = 0; i < vetorA.length; i++) {
                System.out.print(vetorA[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("O ultimo elemento digitado era ímpar");
        }
        sc.close();
    }
}
