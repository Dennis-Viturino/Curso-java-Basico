package src.dennis.programas.exercicios.aula1a13;

import java.util.Scanner;

public class FarenhetParaCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit:");
        double farenheit = sc.nextDouble();
        System.out.println("O valor dessa temperatura em celsius é: " + (5 * (farenheit - 32) / 9));
        sc.close();
    }
}
