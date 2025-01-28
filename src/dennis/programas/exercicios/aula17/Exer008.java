package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        double media;
        int num;

        for (int i = 0; i< 5; i++) {
            System.out.println("Digite um número inteiro");
            num = sc.nextInt();
            soma += num;
        }

        media = soma / 5;
        System.out.println("A soma deu: " + soma);
        System.out.println("A media dos números digitados é: " + media);

    }
}
