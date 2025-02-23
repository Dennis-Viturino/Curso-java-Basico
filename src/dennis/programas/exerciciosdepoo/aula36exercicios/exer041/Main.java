package src.dennis.programas.exerciciosdepoo.aula36exercicios.exer041;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        // Criando um curso
        System.out.println("Cadastro de Curso");
        System.out.print("Nome do curso: ");
        String nomeCurso = scanner.nextLine();
        System.out.print("Horário do curso: ");
        String horarioCurso = scanner.nextLine();
        Curso curso = new Curso(nomeCurso, horarioCurso);
        
        // Cadastrando alunos no curso
        System.out.println("\nCadastro de Alunos:");
        boolean continuarCadastro = true;
        while (continuarCadastro) {
            System.out.print("Nome do aluno: ");
            String nomeAluno = scanner.nextLine();
            
            String matriculaAluno = "";
            boolean matriculaValida = false;
            while (!matriculaValida) {
                System.out.print("Matrícula do aluno: ");
                matriculaAluno = scanner.nextLine();
                try {
                    curso.adicionaAluno(nomeAluno, matriculaAluno);
                    matriculaValida = true; // Se a matrícula for válida, sai do loop
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage() + " Tente novamente.");
                }
            }
            
            System.out.print("Deseja adicionar outro aluno? (sim/não): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("não")) {
                continuarCadastro = false;
            }
        }

        // Cadastrando notas dos alunos
        curso.adicionarNotasAlunos(scanner);

        scanner.nextLine(); 
        
        // Perguntando se já tem um professor
        System.out.println("\nJá tem um professor para o curso? (sim/não)");
        String respostaProfessor = scanner.nextLine();

        // Se sim, pergunta os dados do professor
        if (respostaProfessor.equalsIgnoreCase("sim")) {
            System.out.println("\nCadastro de Professor:");
            System.out.print("Nome do professor: ");
            String nomeProfessor = scanner.nextLine();
            System.out.print("Departamento: ");
            String departamentoProfessor = scanner.nextLine();
            System.out.print("E-mail: ");
            String emailProfessor = scanner.nextLine();
            
            curso.adicionarProfesor(nomeProfessor, departamentoProfessor, emailProfessor);
        } 

        System.out.println(curso);
        scanner.close();
    }
}

