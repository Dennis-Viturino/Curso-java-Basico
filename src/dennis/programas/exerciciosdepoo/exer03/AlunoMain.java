package src.dennis.programas.exerciciosdepoo.exer03;

public class AlunoMain {
    public static void main(String[] args) {
        
        Aluno aluno01 = new Aluno();

        aluno01.setNomeAluno("Dennis de Andrade Viturino");
        aluno01.setMatricula("1234567890");
        aluno01.setCurso("Ciências da Computação");
        
        System.out.println(aluno01.getInfoAluno());
        
        System.out.println("Tentativa de se matricular em Calculo");
        aluno01.cadastraDisciplina("Calculo");

        System.out.println("Tentativa de se matricular em P2");
        aluno01.cadastraDisciplina("P2");

        System.out.println("Tentativa de se matricular em LP2");
        aluno01.cadastraDisciplina("LP2");

        System.out.println("Tentativa de se matricular em LEDA");
        aluno01.cadastraDisciplina("LEDA");

        System.out.println("Cadastrando as notas");
        aluno01.cadastraNotas("Calculo");
        aluno01.cadastraNotas("P2");
        aluno01.cadastraNotas("LP2");
        
        aluno01.listaDisciplinas();
        
    }
}
