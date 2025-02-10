package src.dennis.programas.exerciciosdepoo.aula36exercicios.exer02;

import java.util.Scanner;

public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso(Scanner scan) {
        System.out.println("Digite o nome do curso");
        this.nome = scan.nextLine();
        System.out.println("Digite o Horario do curso");
        this.horario = scan.nextLine();
    }

    public void setQtdAlunos(int num) {
        this.alunos = new Aluno[num];
    }

    public void cadastraAlunos(Scanner sc) {

        System.out.println("Digite a quantidade de Alunos na turma");
        setQtdAlunos(sc.nextInt());
        sc.nextLine();

        for (int i = 0; i < getAlunos().length; i++) {
            System.out.println("Cadastrando aluno " + (i+1));
             this.alunos[i] = new Aluno(sc);
        }
    }

    public String mediaTurma() {
        double mediaTurma = 0;
        for (int i = 0; i < getAlunos().length; i++) {
            mediaTurma += this.alunos[i].getMedia();
        }
        mediaTurma = mediaTurma / getAlunos().length;
        return "A média da turma do curso de " + getNome() + " é " + String.format("%.1f", mediaTurma);
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

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        String retorno = "";
        for (int i = 0; i < getAlunos().length; i++) {
            retorno += this.alunos[i].toString();
            retorno += "\n" + "\n";
        }
        retorno += mediaTurma();
        return retorno;
    }

}
