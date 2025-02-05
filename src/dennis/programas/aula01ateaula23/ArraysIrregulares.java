package src.dennis.programas.aula01ateaula23;

import java.util.Scanner;

public class ArraysIrregulares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão entrevistadas? digite um valor interio");
        int numEntrevistados = sc.nextInt();

        String[][] nomesDosfilhos = new String[numEntrevistados][];

        for (int i = 0; i < nomesDosfilhos.length; i++) {
            
            System.out.println("Entre com a quantidade de filhos");
            int qtdFilhos = sc.nextInt();

            nomesDosfilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomesDosfilhos[i].length; j++) {

                System.out.println("Digite o nome do filho " + (j+1));
                nomesDosfilhos[i][j] = sc.next();

            }
        }
        
        for (int i = 0; i < nomesDosfilhos.length; i++) { 
            System.out.println("Pessoa " + i + " tem " + nomesDosfilhos[i].length + " filhos");
            for (int j = 0; j < nomesDosfilhos[i].length; j++) {
                System.out.println(nomesDosfilhos[i][j]);
            }
        }
        sc.close();
    }
}
