package src.dennis.programas.exerciciosdepoo.aula33exercicios.exer03;

import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Aluno aluno01 = new Aluno();

        aluno01.setNome(sc.nextLine());
        aluno01.setMatricula(sc.nextLine());
        aluno01.setCurso(sc.nextLine());
        
        System.out.println(aluno01.exibirInfoAluno());
        
        System.out.println("Tentativa de se matricular em Calculo");
        aluno01.cadastraDisciplina("Calculo");

        System.out.println("Tentativa de se matricular em P2");
        aluno01.cadastraDisciplina("P2");

        System.out.println("Tentativa de se matricular em LP2");
        aluno01.cadastraDisciplina("LP2");

        System.out.println("Tentativa de se matricular em LEDA");
        aluno01.cadastraDisciplina("LEDA");

        System.out.println("Cadastrando as notas");
        aluno01.cadastraNotas("Calculo");
        aluno01.cadastraNotas("P2");
        aluno01.cadastraNotas("LP2");
        
        aluno01.listaDisciplinas();

        sc.close();
    }
}
