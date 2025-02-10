package src.dennis.programas.exerciciosdepoo.aula35exercicios.exer01;

import java.util.Scanner;

public class FibonacciMain {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número limite, calcularei a sequencai de fibonacci");
        int valor = sc.nextInt();

        for (int i = 0; i <= valor; i++) {
            System.out.print(Fibonacci.fibonacci(i) + " ");
        }

        sc.close();
    }
}
