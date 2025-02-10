package src.dennis.programas.exercicios.aula18e19;

import java.util.Scanner;

public class Exer033 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];
        boolean primo;
        String msg;

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com o valor do vetor A na posição " + i);
            vetorA[i] = sc.nextInt();    
        }

        for (int i = 0; i < vetorA.length; i++) {

            primo = true;
            for (int j = 2; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }

            msg = "";
            if (primo) {
                msg = " é primo";
            } else {
                msg = " não é primo";
            }

            System.out.println(vetorA[i] + msg);
            sc.close();
        }
    }
}
