package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o a base:");
        int base = sc.nextInt();

        System.out.println("Digite o expoente");
        int expoente = sc.nextInt();

        int resultado = base;

        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println(resultado);
        sc.close();
    }
}
