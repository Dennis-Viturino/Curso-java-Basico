package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer024 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        System.out.println("Preço do pão: R$ 0.18");
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for (int i =1; i <= 50; i++ ) {
            System.out.println(i + " - R$ " + (0.18 * i));
        }
    }
}
