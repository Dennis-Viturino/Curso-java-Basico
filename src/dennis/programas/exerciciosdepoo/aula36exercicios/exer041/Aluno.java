package src.dennis.programas.exerciciosdepoo.aula36exercicios.exer041;

import java.util.Arrays;

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[4];
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }

    public void adicionaNotas(int idx, double nota) {
        if (idx < 0 || idx > notas.length) {
            throw new IllegalArgumentException("Índice inválido: " + idx);
        }
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota inválida: " + nota + ". Deve estar entre 0 e 10.");
        }
        notas[idx] = nota;
    }

    public String exibirNotas() {
        return Arrays.toString(notas);
    }

    public double getMedia() {
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }

        return media / notas.length;
    }

    private boolean verificaStatus() {
        return getMedia() >= 7;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome: ").append(getNome()).append("\n");
        retorno.append("Matricula: ").append(getMatricula()).append("\n");
        retorno.append("Notas: ").append(exibirNotas()).append("\n");
        retorno.append("Situação: ").append("O aluno foi ").append((verificaStatus() ? "Aprovado" : "Reprovado")).append("\n");
        retorno.append("Média final: ").append(String.format("%.1f", getMedia()));
        return retorno.toString();
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
}
