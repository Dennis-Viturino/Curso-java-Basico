package src.dennis.programas.exercicios.aula1a13;

import java.util.Scanner;

public class AreaDeUmQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado");
        double lado = sc.nextDouble();
        
        System.out.println("A área é de: " + (Math.pow(lado, 2)));
        System.out.println("E o dobro da área é: " + ((Math.pow(lado, 2)) * 2));
        sc.close();
    }
}
