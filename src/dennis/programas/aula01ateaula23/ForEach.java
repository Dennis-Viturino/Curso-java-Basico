package src.dennis.programas.aula01ateaula23;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        
        int[] notas = new int[10];
        Random random = new Random();

        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextInt(10);
        }


        // o for each com tipos primitivos não atribui valor
        System.out.println("Usando for each"); 
        for (int nota : notas) {
            System.out.println(nota);
        }

        // output de uma matriz com for each

        System.out.println("Exemplo de for each para matrizes");
        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        for (double[] notaAluno : notasAlunos) {
            for (double nota : notaAluno) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }

    }
}
