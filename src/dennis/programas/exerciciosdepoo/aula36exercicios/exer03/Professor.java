package src.dennis.programas.exerciciosdepoo.aula36exercicios.exer03;

public class Professor {

    private String nome;
    private String departamento;
    private String email;

    public Professor(String nome, String departamento, String email) {
        this.nome = nome;
        this.departamento = departamento;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do professor: ").append(nome).append("\n");
        retorno.append("Departamento: ").append(departamento).append("\n");
        retorno.append("E-mail: ").append(email);

        return retorno.toString();
    }
}
