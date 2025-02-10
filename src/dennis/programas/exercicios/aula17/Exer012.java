package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o número para gera a tabuada:");
        int num = sc.nextInt();

        System.out.println("Tabuada de: " + num + ":");

        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
        sc.close();
    }
}
