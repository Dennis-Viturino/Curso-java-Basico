package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        String aproveitamento = "";
        if (media >= 9 && media <= 10) {
            aproveitamento = "A";
        } else if (media >= 7.5 && media < 9) {
            aproveitamento = "B";
        } else if (media >= 6 && media < 7.5) {
            aproveitamento = "C";
        } else if (media >= 4 && media < 6) {
            aproveitamento = "D";
        } else if (media >= 0 && media < 4) {
            aproveitamento = "E";
        }
        
        switch (aproveitamento) {
            case "A":
            case "B":
            case "C": System.out.println(nota1 + " " + nota2 + " " + "(" + media + ")" + " " + aproveitamento + " Aprovado"); break;
            case "D":
            case "E": System.out.println(nota1 + " " + nota2 + " " + "(" + media + ")" + " " + aproveitamento + " Reprovado"); break;
        }
    }
}