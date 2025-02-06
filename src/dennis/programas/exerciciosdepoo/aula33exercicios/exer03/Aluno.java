package src.dennis.programas.exerciciosdepoo.aula33exercicios.exer03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinasAluno;
    private double[][] notasDisciplinas;
    private Scanner sc = new Scanner(System.in);

    public Aluno() {
        disciplinasAluno = new String[3];
        notasDisciplinas = new double[disciplinasAluno.length][4];
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        disciplinasAluno = new String[3];
        notasDisciplinas = new double[disciplinasAluno.length][4];
    }


    public void cadastraDisciplina(String disciplina) {
        for (int i = 0; i <= disciplinasAluno.length; i++) {
            if (i != disciplinasAluno.length) {
                if (disciplinasAluno[i] == null) {
                disciplinasAluno[i] = disciplina;
                System.out.println("Cadastro realizado com sucesso. Voçê foi matriculado em " + disciplina);
                break;
                }
            } else if(i == disciplinasAluno.length) {
                System.out.println("Voçê não pode se cadastrar em mais uma disciplina");
            } 
        }
    }

    public void cadastraNotas(String disciplina) {
        for (int i = 0; i < disciplinasAluno.length; i++) {
            if (disciplinasAluno[i].equalsIgnoreCase(disciplina)) {
                for (int j = 0; j < notasDisciplinas[i].length; j++) {
                    System.out.println("Digite a nota " + (j+1) + " da disciplina " + disciplina);
                    notasDisciplinas[i][j] = sc.nextDouble();
                }
            }
        }
    }

    public void listaDisciplinas() {
        for (int i = 0; i < disciplinasAluno.length; i++) {
            System.out.println(disciplinasAluno[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print("Nota " + (j+1) + " = " + notasDisciplinas[i][j] + " ");
            }
            System.out.println();
            aprovado(disciplinasAluno[i]);
            System.out.println();
        }
    }

    public void aprovado(String disciplina) {
        DecimalFormat mediaFinal = new DecimalFormat("###,###.##");
        double media;
        double soma = 0;
        int idnota = 0;
        for (int i = 0; i < disciplinasAluno.length; i++) {
            if (disciplinasAluno[i].equalsIgnoreCase(disciplina)) {
                for (int j = 0; j < notasDisciplinas[i].length; j++) {
                    soma+= notasDisciplinas[i][j];
                    idnota = j+1;
                }
            }
        }

        media = soma / idnota;

        if (media >= 7) {
            System.out.println("O aluno foi Aprovado em " + disciplina);
        } else {
            System.out.println("O aluno foi Reprovado em " + disciplina);
        }

        System.out.println("Média final do aluno: " + mediaFinal.format(media));
    }

    public String exibirInfoAluno() {
        String retorno = "";
        retorno += "Nome do Aluno: " + nome + "\n";
        retorno += "Matricula do Aluno: " + matricula + "\n";
        retorno += "Cursando: " + curso + "\n";
        return retorno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
