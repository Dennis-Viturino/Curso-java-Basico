package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de turmas");
        int numTurmas = sc.nextInt();

        int numAlunosPorTurma;
        int soma = 0;
        boolean invalido = true;


        for (int i =1; i <= numTurmas; i++) {

            invalido = true;
            do {
                System.out.println("Digite a quantidade de Alunos por turma " + i);
                numAlunosPorTurma = sc.nextInt();

                if (numAlunosPorTurma <= 40) {
                    invalido = false;
                } else {
                    System.out.println("Número de alunos inválido, digite novamente.");
                }
            } while (invalido);

            soma += numAlunosPorTurma;

        }

        double media = soma / numTurmas;

        System.out.println("Média: " + media);
        sc.close();
    }
}
