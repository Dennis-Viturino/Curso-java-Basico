package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valido = false;
        double popA;
        double popB;
        int cont = 0;
        double taxaA;
        double taxaB;


        do {
            System.out.println("Entre com a popolução A");
            popA = sc.nextDouble();

            if (popA > 0) {
                valido = true;
            } else {
                System.out.println("População A precisa ser maior que 0");
            }

            System.out.println("Entre com a população B");
            popB = sc.nextDouble();

            valido = false;
            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("População B precisa ser maior que 0");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Entre com a Taxa de crescimento da população A");
            taxaA = sc.nextDouble();

            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("A taxa de crescimento de A precisa ser maior que 0");
            }

            valido = false;

            System.out.println("Entre com a Taxa de crescimento da população B");
            taxaB = sc.nextDouble();

            valido = false;
            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("A taxa de crescimento de B precisa ser maior que 0");
            }

        } while (!valido);

        while (popA < popB) {
            popA += (popA / 100) * taxaA;
            popB += (popB / 100) * taxaB;
            cont++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidade anos: " + cont);

    }
}
