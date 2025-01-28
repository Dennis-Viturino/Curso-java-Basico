package src.dennis.programas.exercicios.aula1a13;

import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 4 notas para a media ser calculada");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();

        System.out.println("A média é: " + ((nota1 + nota2 + nota3 + nota4) / 4));
    }
}
