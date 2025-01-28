package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer018 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite o valor do vetorA na posição " + (i + 1));
            idades[i] = sc.nextInt();

        }

        int menor = idades[0];
        int indexMenor = 0;
        int maior = idades[0];
        int indexMaior = 0;

        for(int i = 1; i < idades.length; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
                indexMaior = i;
            } else if (idades[i] < menor) {
                menor = idades[i];
                indexMenor = i;
            }
        }

        System.out.print("Vetor A = ");
        for ( int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();

        System.out.println("Menor idade: " + menor);
        System.out.println("Posição da menor idade: " + indexMenor);

        System.out.println("Maior idade: " + maior);
        System.out.println("Posição da maior idade: " + indexMaior);

    }
}
