package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = sc.nextInt();

        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Não é primo - divisível por " + i);
                primo = false; 
                // break;
            } 
        }

        if (primo) {
            System.out.println("é primo");
        }
        sc.close();
    }
}
