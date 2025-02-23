package src.dennis.programas.exerciciosdepoo.aula36exercicios.exer041;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Curso(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
        this.alunos = new ArrayList<>();
    }

    public void adicionaAluno(String nome, String matricula) {
        Aluno novoAluno = new Aluno(nome, matricula);

        for(Aluno a : alunos) {
            if(a.equals(novoAluno)) {
                throw new IllegalArgumentException("Matricula já cadastrada");
            }
        }
        alunos.add(novoAluno);
    }

    public void adicionarNotasAlunos(Scanner scanner) {
        for (Aluno aluno : alunos) {
            for (int i = 0; i < aluno.getNotas().length; i ++) {
                boolean notaValida = false;
                while (!notaValida) {
                    System.out.println("Digite a nota " + (i + 1) + " de " + aluno.getNome());
                    try {
                        Double nota = scanner.nextDouble();
                        aluno.adicionaNotas(i, nota);
                        notaValida = true;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            System.out.println("Notas do aluno " + aluno.getNome() + " cadastradas com sucesso");
        }
    }

    private double pegarMediaTurma() {
        double mediaTurma = 0;
        for(Aluno aluno : alunos) {
            mediaTurma += aluno.getMedia();
        }
        return mediaTurma / alunos.size();
    }

    public void adicionarProfesor(String nome, String departamento, String email) {
        professor = new Professor(nome, departamento, email);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();

        retorno.append("Nome do Curso: ").append(getNome()).append("\n");
        retorno.append("Horario da aulas: ").append(getHorario()).append("\n");
        if (professor != null) {
            retorno.append(getProfessor()).append("\n");
        } else {
            retorno.append("Professor: Indefinido").append("\n");
        }
        retorno.append("---- Alunos da Turma ----").append("\n");
        retorno.append("--------------\n");
        for(Aluno aluno : alunos) {
            retorno.append(aluno).append("\n");
            retorno.append("--------------\n");
        }
        retorno.append("Media da turma: ").append(pegarMediaTurma());
        return retorno.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
