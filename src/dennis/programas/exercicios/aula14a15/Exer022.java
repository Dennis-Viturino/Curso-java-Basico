package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade (kg) de morango:");
        double qtdMorango = sc.nextDouble();

        System.out.println("Entre com a quantidade (kg) de maça:");
        double qtdMaca = sc.nextDouble();

        double precoKiloMorango = 0;
        if (qtdMorango <= 5) {
            precoKiloMorango = 2.5;
        } else {
            precoKiloMorango = 2.2;
        }

        double precoKiloMaca = 0;
        if (qtdMaca <= 5) {
            precoKiloMaca= 1.8;
        } else {
            precoKiloMaca = 1.5;
        }

        double precoTotalMorango = qtdMorango * precoKiloMorango;
        double precoTotalMaca = qtdMaca * precoKiloMaca;

        double precoParcial = precoTotalMaca + precoTotalMorango;
        double precoTotal = precoParcial;

        if ((qtdMorango + qtdMaca > 8) || precoParcial > 25) {
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }

        System.out.println("Preço total = " + precoTotal);
        sc.close();
    }
}