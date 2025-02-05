package src.dennis.programas.aula01ateaula23;

import java.util.Scanner;

public class LeituraDeDadosDoTeclado {
    public static void main(String[] args) {

        // Definindo uma variavel scanner
        Scanner sc = new Scanner(System.in);
        

        /*
        // lendo uma linha inteira
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = sc.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        // ler só a proxima string
        System.out.println("Digite seu primeiro nome:");
        String primeiroNome = sc.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome); 

        // ler um inteiro
        System.out.println("Digite a sua idade:");
        int idade = sc.nextInt();
        System.out.println("Sua idade é: " + idade);
        

        // ler um double com virgula no vscode
        System.out.println("Digite a sua altura:");
        double altura = sc.nextDouble();
        System.out.println("A sua altura é: " + altura);
        */


        System.out.println("Digite seu primeiro nome, idade, salario, e se é casado:");
        String primeiroNome = sc.next();
        int idade = sc.nextInt();
        double salario = sc.nextDouble();
        boolean casado = sc.nextBoolean();

        System.out.println("Suas informações foram cadrastadas como:");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Seu salário é: " + salario);
        System.out.println("Casado: " + casado);
        sc.close();
    }
}
