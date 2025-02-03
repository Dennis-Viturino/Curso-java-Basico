package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double produto1 = sc.nextDouble();
        double produto2 = sc.nextDouble();
        double produto3 = sc.nextDouble();
        
        if (produto1 <= produto2 && produto1 <= produto3) {
            System.out.println("Compre o produto 1");
        } else if(produto2 <= produto1 && produto2 <= produto3) {
            System.out.println("Compre o produto 2");
        } else if (produto3 <= produto1 && produto3 <= produto2) {
            System.out.println("Compre o produto 3");
        }
        sc.close();
    }
}
