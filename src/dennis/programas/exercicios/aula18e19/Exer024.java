package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer024 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        boolean palindromo = true;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do Vetor A na posição " + (i+1));
            vetorA[i] = sc.nextInt();
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < vetorA.length; i++) { 

            if (vetorA[i] != vetorA[vetorA.length - i - 1]) {
                System.out.println("Não é palíndromo");
                palindromo = false;
                break;
            } 
        }

        if (palindromo) {
            System.out.println("É palíndromo");
        }
        sc.close();
    }
}
