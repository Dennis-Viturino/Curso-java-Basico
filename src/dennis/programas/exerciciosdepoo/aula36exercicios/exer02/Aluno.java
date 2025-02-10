package src.dennis.programas.exerciciosdepoo.aula36exercicios.exer02;

import java.util.Scanner;

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(Scanner sc) {
        System.out.println("Digite o nome do aluno");
        this.nome = sc.nextLine();
        System.out.println("Digite a matricula");
        this.matricula = sc.nextLine();
        this.notas = new double[4];
        adicionaNotas(sc);
    }

    public void adicionaNotas(Scanner sc) {
        for (int i = 0; i < getNotas().length; i++) {
            System.out.println("Entre com a nota " + (i+1) + " do aluno");
            notas[i] = sc.nextDouble();
            sc.nextLine();
        }
        setNotas(notas);
    }

    private double calculaMediaAluno() {
        double soma = 0;
        int idx = 0;
        for (double nota : getNotas()) {
            soma += nota;
            idx++;
        }
        return soma / idx;
    }

    public double getMedia() {
        return calculaMediaAluno();
    }

    public String verificaMedia() {
        if (calculaMediaAluno() >= 7) {
            return "O aluno foi aprovado. Média final = " + String.format("%.1f", getMedia());
        }
        return "O aluno foi reprovado. Média final = " + String.format("%.1f", getMedia());
    }

    // Utilizando o StringBuilder

    /* public String getNotasAluno() {
     *   StringBuilder retorno = new StringBuilder();
     *   dor (double nota : getNotas()) {
     *       retorno.append(String.format("%.1f", nota)).append(" ");
     *   }
     *   return retorno.toString().trim();
     * }
    */

    public String getNotasAluno() {
        String retorno = "";
        for (double nota : getNotas()) {
            retorno += nota + " ";
        }
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

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString(){
        return "Nome do Aluno: " + nome + "\n"
        + "Matricula: " + matricula + "\n"
        + "Notas: " + getNotasAluno() + "\n"
        + "Situação: " + verificaMedia(); 
    }

}
