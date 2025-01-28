package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean informacoesValidas = false;
        String nome;
        String senha;

        do {

            System.out.println("Digite o seu nome de usuario");
            nome = sc.next();

            System.out.println("Digite a sua senha");
            senha = sc.next();

            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("Senha igual a usuario, digite novamente");
            } else {
                informacoesValidas = true;
                System.out.println("Informações válidas");
            }

        } while (!informacoesValidas);
    }
}
