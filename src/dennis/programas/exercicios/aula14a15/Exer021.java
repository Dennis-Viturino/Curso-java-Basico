package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de litros vendidos");
        double litros = sc.nextDouble();

        System.out.println("Entre com o tipo de combustível (A our G)");
        String tipo = sc.next();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percentualDesconto = 0;
        double total = 0;
        double totalDesconto = 0;

        if (tipo.equalsIgnoreCase("a")) {
            if (litros <= 20) {
                percentualDesconto = 3;
            } else {
                percentualDesconto = 5;
            }

            total = litros * precoAlc;

        } else if (tipo.equalsIgnoreCase("g")) {
            if (litros <= 20) {
                percentualDesconto = 4;
            } else {
                percentualDesconto = 6;
            }

            total = precoGas;
        }

        totalDesconto = (total / 100) * percentualDesconto;
        
        double precoAPagar = total - totalDesconto;
        System.out.println("O valor a ser pago é: " + precoAPagar);
        sc.close();
    }
}