package src.dennis.programas.exercicios.aula1a13;

import java.util.Scanner;

public class Exer012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua altura e eu calculo seu peso ideal");
        double altura = sc.nextDouble();
    
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}
