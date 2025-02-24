package src.dennis.programas.aula37;

public class Professor extends Pessoa {

    private String departamento;
    private String nomeCurso;
    private double salario;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiq() {
        return 0;
    }

}
