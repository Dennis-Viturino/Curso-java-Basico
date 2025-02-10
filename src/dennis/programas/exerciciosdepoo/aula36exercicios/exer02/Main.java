package src.dennis.programas.exerciciosdepoo.aula36exercicios.exer02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Curso curso01 = new Curso(sc);
        curso01.cadastraAlunos(sc);
        System.out.println(curso01.toString());

        //System.out.println("Digite o nome do Aluno");
        //Aluno aluno001 = new Aluno(sc.nextLine(), sc);
        //aluno001.adicionaNotas(sc);

        //System.out.println(curso01.getNome());
        //System.out.println(aluno001.toString());

        sc.close();
    }
}
