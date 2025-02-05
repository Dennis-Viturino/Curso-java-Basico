package src.dennis.programas.exerciciosdepoo.exer03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aluno {

    String nome;
    String matricula;
    String curso;
    String[] disciplinasAluno = new String[3];
    double[][] notasDisciplinas = new double[3][4];

    Scanner sc = new Scanner(System.in);

    void setCurso(String curso) {
        this.curso = curso;
    }

    void setNomeAluno(String nome) {
        this.nome = nome;
    }

    void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // O get info ira buscar as informações do aluno como nome, matricula e curso
    String getInfoAluno() {
        String retorno = "";
        retorno += "Nome do Aluno: " + nome + "\n";
        retorno += "Matricula do Aluno: " + matricula + "\n";
        retorno += "Cursando: " + curso + "\n";
        return retorno;
    }

    /*  O metodo aprovado recebe uma string com o nome da disciplina e irá verificar as notas e a media
     *   verifica se a media é >= a 7 e imprime se o aluno foi aprovado ou reprovado juntamente com a nota final 
     */
    void aprovado(String disciplina) {
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

    /*  O metodo cadastraDisciplina recene uma String sendo o nome da disciplina e verifica se o aluno já
     *  está matriculado 3 disciplinas, se não estiver ele matricula nestá nova disciplina
     */
    void cadastraDisciplina(String disciplina) {
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

    /* O metodo cadastraNotas recebe novamente uma String com o nome da disciplina e procura tal nome nas
     * disciplinas em que o aluno está matriculado, assim que o acha, roda o for para adicionar as notas conforme
     * a entrada do usúario.
     */
    void cadastraNotas(String disciplina) {
        for (int i = 0; i < disciplinasAluno.length; i++) {
            if (disciplinasAluno[i].equalsIgnoreCase(disciplina)) {
                for (int j = 0; j < notasDisciplinas[i].length; j++) {
                    System.out.println("Digite a nota " + (j+1) + " da disciplina " + disciplina);
                    notasDisciplinas[i][j] = sc.nextDouble();
                }
            }
        }
    }

    /* O metodo listaDisciplinas irá percorrer todas as disciplinas e listará as notas do aluno
     * e utiliza o metodo aprovado para verificar se o aluno foi aprovado em cada disciplina
     */
    void listaDisciplinas() {
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
}
