package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = sc.nextInt();
        int comeco;
        int terminar;
        boolean invalido = true;

        do {
            System.out.println("Digite o Começo da Tabuada");
            comeco = sc.nextInt();

            System.out.println("Digite o final da Tabuada");
            terminar = sc.nextInt();

            if (terminar < comeco) {
                System.out.println("Voçê digitou o final maior que o começo, digite valores válidos");

            } else {
                invalido = false;
            }

        } while (invalido);

        System.out.println("Vou montar a tabuada do " + num + " começando em " + comeco + " e terminando em " + terminar);

        for (int i = comeco; i <= terminar; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
        sc.close();
    }
}