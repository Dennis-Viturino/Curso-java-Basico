package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro número");
        int num1 = sc.nextInt();

        System.out.println("Entre com o segundo número");
        int num2 = sc.nextInt();

        int soma = 0;

        for(int i = num1; i <= num2; i++) {
            soma += i;
        }

        System.out.println(soma);
        sc.close();
    }
}
