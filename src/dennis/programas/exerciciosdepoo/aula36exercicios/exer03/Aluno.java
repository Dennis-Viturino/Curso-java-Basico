package src.dennis.programas.exerciciosdepoo.aula36exercicios.exer03;

import java.util.Scanner;

public class Aluno {

    private String nome;
    private String matricula;
    private double notas[];

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[4];
    }

    public Aluno() {}

    public void cadastraNotas(Scanner sc) {
        System.out.println("Digite as " + notas.length + " notas do aluno " + nome + ":");

        for (int i = 0; i < notas.length; i++) {
            while (true) {
                System.out.println("Nota " + (i+1) + ": ");
                if (sc.hasNextDouble()) {
                    notas[i] = sc.nextDouble();
                    break;
                } else {
                    System.out.println("Entrada inválida. Digite um número válido.");
                    sc.next();
                }
            }
        }
        sc.nextLine();
    }

    public String printNotasAluno() {
        StringBuilder retorno = new StringBuilder();
        for (double nota : notas) {
            retorno.append(String.format("%.1f", nota)).append(" ");
        }
        return retorno.toString().trim();
    }

    public double calculaMediaAluno() {
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        return media / notas.length;
    }

    public String verificaMedia() {
        return calculaMediaAluno() >= 7 ? "Aprovado" : "Reprovado";
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

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();

        retorno.append("Nome do Aluno: ").append(nome).append("\n");
        retorno.append("Matrícula: ").append(matricula).append("\n");
        retorno.append("Notas: ").append(printNotasAluno()).append("\n");
        retorno.append("Média: ").append(String.format("%.1f", calculaMediaAluno())).append("\n");
        retorno.append("Situação: ").append(verificaMedia());

        return retorno.toString();
    }
}
