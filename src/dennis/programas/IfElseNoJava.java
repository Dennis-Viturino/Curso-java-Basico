package src.dennis.programas;

import java.util.Scanner;

public class IfElseNoJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o preço do item");
        double valor = sc.nextDouble();

        if (valor <= 10) {
            System.out.println("Está barato, pode comprar");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Voçê pode pedir um desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else { // valor >= 17
            System.out.println("Muito caro");
        }

        sc.close();
    }
}
