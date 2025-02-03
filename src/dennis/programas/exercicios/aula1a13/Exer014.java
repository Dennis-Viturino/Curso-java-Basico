package src.dennis.programas.exercicios.aula1a13;

import java.util.Scanner;

public class Exer014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o tamanho do arquivo");
        double tamanhoArquivo = sc.nextDouble();

        System.out.println("Entre com a velocidade da internet");
        double velocidadeInternet = sc.nextDouble();

        double tempo = tamanhoArquivo / velocidadeInternet;
        System.out.println("Tempo de download: " + tempo);
        sc.close();
    }
}
