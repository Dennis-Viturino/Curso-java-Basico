package src.dennis.programas.exerciciosdepoo.aula36exercicios.exer03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Curso");
        String nomeCurso = sc.nextLine();
        System.out.println("Digite o horário do curso");
        String horario = sc.nextLine();
        
        Curso curso = new Curso(nomeCurso, horario);

        System.out.println("Já tem professor definido? Digite S para sim e N para não");
        String temProfessor = sc.nextLine();

        if (temProfessor.equalsIgnoreCase("s")) {
            System.out.println("Digite o nome do professor");
            String nomeProf = sc.nextLine();
            System.out.println("Digite o departamento de ensino");
            String departamento = sc.nextLine();
            System.out.println("Digite o Email para os alunos entrarem em contato");
            String email = sc.nextLine();

            Professor professor = new Professor(nomeProf, departamento, email);
            curso.setProfessor(professor);
        }

        System.out.println("Digite a quantidade de alunos na turma");
        int qtdAlunos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            System.out.println("Digite a matrícula do aluno: (9 Digitos)");
            String matricula = sc.nextLine();

            Aluno aluno = new Aluno(nome, matricula);
            aluno.cadastraNotas(sc);

            curso.adicionarAluno(aluno);
        }

        System.out.println(curso);

        sc.close();
    }
}
