package src.dennis.programas.exerciciosdepoo.aula36exercicios.exer03;

import java.util.ArrayList;

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

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public double mediaTurma() {
        double media = 0;
        for (Aluno aluno : alunos) {
            media += aluno.calculaMediaAluno();
        }
        return media / alunos.size();
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

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();

        retorno.append("---------------\n");
        retorno.append("Curso: ").append(nome).append("\n");
        retorno.append("Horário: ").append(horario).append("\n");

        if (professor != null) {
            retorno.append(professor).append("\n");
        } else {
            retorno.append("Professor: Não definido\n");
        }

        retorno.append("---------------\n");
        retorno.append("Alunos cadastrados: ").append(alunos.isEmpty() ? "Nenhum aluno cadastrado" : "").append("\n");
        retorno.append("---------------\n");
        
        for (Aluno aluno : alunos) {
            retorno.append(aluno).append("\n");
            retorno.append("---------------\n");
        }

        retorno.append("Média da turma: ").append(String.format("%.1f", mediaTurma())).append("\n");
        retorno.append("---------------").append("\n");

        return retorno.toString();
    }
}
