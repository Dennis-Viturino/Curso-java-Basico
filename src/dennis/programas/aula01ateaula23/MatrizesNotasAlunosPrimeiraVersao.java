package src.dennis.programas.aula01ateaula23;

import java.util.Scanner;

public class MatrizesNotasAlunosPrimeiraVersao {
    public static void main(String[] args) {

        // minha versão sem ver a aula

        Scanner sc = new Scanner(System.in);

        double[][] notasAlunos = new double[10][2];

        for (int i = 0; i < notasAlunos.length; i++) {

            System.out.println("Digite as notas do aluno " + (i + 1));
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println("Digite a nota " + (j + 1));
                notasAlunos[i][j] = sc.nextDouble();
            }

            System.out.println("As notas do aluno " + i + " São");

            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");
            }

            System.out.println();

        }
        sc.close();
    }
}
