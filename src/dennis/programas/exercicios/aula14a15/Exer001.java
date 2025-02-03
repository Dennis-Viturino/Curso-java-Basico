package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println(num1);
        } else if (num1 < num2) {
            System.out.println(num2);
        } else {
            System.out.println("Os números são iguais");
        }
        sc.close();
    }
}
