package src.dennis.programas.aula35;

import java.util.Scanner;

public class MainCalculadora {

    public static void imprimir(int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        imprimir(CalculadoraRecursividade.fatorialRecursivo(sc.nextInt()));

        sc.close();
    }
}