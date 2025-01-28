package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = sc.nextInt();
        boolean primo;

        for (int i = 1; i <= num; i++) {

            primo = true;

            for (int j = 2; j < i; j ++) {
                if (i % j == 0) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.println(i);
            }
        
        }

    }
}
