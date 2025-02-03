package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        if (num1 >= 0) {
            System.out.println("É positivo");
        } else {
            System.out.println("É negativo");
        }
        sc.close();
    }
}
