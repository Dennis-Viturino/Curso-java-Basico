package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("num1 é maior: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("num2 é maior: " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("num3 é maior: " + num3);
        }

        if (num1 <= num2 && num1 <= num3) {
            System.out.println("num1 é menor: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("num2 é menor: " + num2);
        } else if (num3 <= num1 && num3 <= num2) {
            System.out.println("num3 é menor: " + num3);
        }
    }
}
