package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite os 3 valores para os lados");
        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();

        if (((lado1 + lado2) > lado3) || 
            ((lado1 + lado3) > lado2) ||
            ((lado2 + lado3) > lado1)) {
            
                if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                    System.out.println("Triangulo Equilátero");
                } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                    System.out.println("Triangulo Escaleno");
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("Triangulo Isóceles");
                }  
        } else {
            System.out.println("Não forma um triangulo");
        }

    }
}