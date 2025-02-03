package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o tipo da carne?");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int tipo = sc.nextInt();

        System.out.println("Diga a quantidade (kg):");
        double qtd = sc.nextDouble();

        double precoKG = 0;

        if (tipo == 1) {

            System.out.println(qtd + "kg - file duplo");

            if (qtd <= 5) {
                precoKG = 4.9;
            } else {
                precoKG = 5.8;
            }
        } else if (tipo == 2) {

            System.out.println(qtd + "kg - alcatra");

            if (qtd <= 5) {
                precoKG = 5.9;
            } else {
                precoKG = 6.8;
            }
        } else if (tipo == 3) {

            System.out.println(qtd + "kg - picanha");

            if (qtd <= 5) {
                precoKG = 6.9;
            } else {
                precoKG = 7.8;
            }
        }
        
        double total = qtd * precoKG;
        System.out.println(qtd + "kg * " + precoKG + " = " + total);

        System.out.println("Compra no cartão? digite 1 para sim");
        int cartao = sc.nextInt();

        if (cartao == 1) {
            double desconto = (total / 100) * 5;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar: " + (total - desconto));
        } else {
            System.out.println("O valor a pagar é: " + total);
        }
        sc.close();
    }
}