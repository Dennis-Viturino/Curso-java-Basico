package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas");
        int qtdPessoas = sc.nextInt();

        int soma = 0;
        double media;
        int idade;

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.println("Digite sua Idade Aluno " + (i + 1));
            idade = sc.nextInt();

            soma += idade;
        }

        media = soma / qtdPessoas;

        if (media >= 0 && media <= 25) {
            System.out.println("A turma é formada por jovens, media, da idade dos alunos é " + media);
        } else if (media >= 26 && media <= 60) {
            System.out.println("A turma é formada por adultos, media da idade dos alunos é " + media);
        } else {
            System.out.println("A turma é formada por Idosos, media da idade dos alunos é " + media);
        }
    }
}
