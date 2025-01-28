package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean notaValida = false;

        do {
                
            System.out.println("Entre com uma nota entre 0 e 10");
            double nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Voçê digitou: " + nota);

            } else {
                System.out.println("Nota inválida, digite novamente.");
            }

        } while (!notaValida); 
    }
}
