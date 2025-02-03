package src.dennis.programas.exercicios.aula1a13;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números para serem somados");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("A soma desses dois números é?: " + (num1 + num2));
        sc.close();
    }
}
