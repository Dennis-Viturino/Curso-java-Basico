package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean infoValida = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {

            System.out.println("Entre com o nome:");
            nome = sc.next();

            if (nome.length() >= 3) {
                infoValida = true;
            } else {
                System.out.println("Nome precisa de no minimo 3 caracteres");
            }
        } while (!infoValida);

        infoValida = false;
        
        do {

            System.out.println("Entre com a idade:");
            idade = sc.nextInt();

            if (idade >= 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        } while (!infoValida);

        infoValida = false;

        do {

            System.out.println("Entre com o sálario:");
            salario = sc.nextDouble();

            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("Salario precisa ser maior que 0");
            }
        } while (!infoValida);

        infoValida = false;

        do {

            System.out.println("Entre com o Genero:");
            sexo = sc.next();

            if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("feminino")) {
                infoValida = true;
            } else {
                System.out.println("O genero tem que ser masculino ou feminino");
            }
        } while (!infoValida);

        infoValida = false;

        do {

            System.out.println("Entre com o Estado-Civil:");
            estadoCivil = sc.next();

            if (estadoCivil.equalsIgnoreCase("solteiro") || estadoCivil.equalsIgnoreCase("casado") || estadoCivil.equalsIgnoreCase("viuvo") || estadoCivil.equalsIgnoreCase("divorciado")) {
                infoValida = true;
            } else {
                System.out.println("O Estado-Cívil precisa ser solteiro, casado, viuvo ou divorciado");
            }
        } while (!infoValida);

        System.out.println("Todas as informações estão válidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sálario: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado-Cívil: " + estadoCivil);
    }
}