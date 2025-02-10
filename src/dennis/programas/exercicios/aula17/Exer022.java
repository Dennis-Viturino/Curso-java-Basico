package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de cds");
        int qtdCDS = sc.nextInt();

        double preco;
        double soma = 0;

        for (int i = 1; i <= qtdCDS; i++) {
            System.out.println("Digite o valor do CD " + i);
            preco = sc.nextDouble();

            soma += preco;
        }

        double media = soma / qtdCDS;

        System.out.println("Média gasta com cada CD " + media);
        sc.close();
    }
}
