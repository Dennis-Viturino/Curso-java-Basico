package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lojas Quase Dois - Tabela de preços");

        for (int i =1; i <= 50; i++ ) {
            System.out.println(i + " - R$ " + (1.99 * i));
        }
        sc.close();
    }
}
