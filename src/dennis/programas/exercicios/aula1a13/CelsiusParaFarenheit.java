package src.dennis.programas.exercicios.aula1a13;

import java.util.Scanner;

public class CelsiusParaFarenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius");
        double celsius = sc.nextDouble();
        System.out.println("Está temperatura corresponde a " + ((celsius * 1.8) + 32) + " em Farenheit");
        sc.close();
    }
}
