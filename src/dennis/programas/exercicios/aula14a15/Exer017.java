package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o ano");
        int ano = sc.nextInt();

        if ((ano % 400) == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("É bissexto");
        } else {
            System.out.println("Não é bissexto");
        }
        sc.close();
    }
}