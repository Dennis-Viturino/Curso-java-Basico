package src.dennis.programas.exerciciosdepoo.aula36exercicios.exer01;

public class Agenda {

    private String nome;
    private Contato[] contatos; 

    public Agenda(String nome) {
        this.nome = nome;
    }

    public Agenda() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        String retorno = "";
        boolean jaRodou = false;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                if (jaRodou) {
                    return retorno;
                } else {
                    return "Não há contatos cadastrados";
                }
            }
            jaRodou = true;
            retorno += "Contato " + (i+1) + "\n";
            retorno += contatos[i].toString();
            retorno += "\n";
        }
        return retorno;
        
    }
}
