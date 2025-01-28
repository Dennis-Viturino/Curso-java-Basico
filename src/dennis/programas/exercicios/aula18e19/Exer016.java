package src.dennis.programas.exercicios.aula18e19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer016 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int somaAbaixoDeQuinze = 0;
        int qtdIguaisAQuinze = 0;
        int somaAcima = 0;
        int qtdAcima = 0;
        double mediaAcimaDeQuinze;

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Digite o valor do Vetor A na posição " + i);
            vetorA[i] = sc.nextInt();

            if (vetorA[i] < 15) {
                somaAbaixoDeQuinze += vetorA[i];
            } else if (vetorA[i] == 15) {
                qtdIguaisAQuinze ++;
            } else {
                qtdAcima ++;
                somaAcima += vetorA[i];
            }

        }
        
        mediaAcimaDeQuinze = somaAcima / qtdAcima;

        System.out.print("Vetor A = ");
        for ( int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println("A soma dos elementos inferiores a 15 é " + somaAbaixoDeQuinze);
        System.out.println("A quantidade de elementos que são iguais a 15 é: " + qtdIguaisAQuinze);
        System.out.println("A média dos valores maiores que 15 é: " + (df.format(mediaAcimaDeQuinze)));
    }
}
