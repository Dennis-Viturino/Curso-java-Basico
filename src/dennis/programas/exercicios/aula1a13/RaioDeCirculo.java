package src.dennis.programas.exercicios.aula1a13;

import java.util.Scanner;

public class RaioDeCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o raio do circulo:");
        double raio = sc.nextDouble();
        System.out.println("A área de um criculo é: " + (Math.PI * Math.pow(raio, 2)));
        sc.close();
    }
}
