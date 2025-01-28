package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu turno, M-matutino, V-vespertino e N-noturno");
        String turno = sc.next();

        switch (turno) {
            case "m":
            case "M": System.out.println("Bom dia"); break;
            case "v":
            case "V": System.out.println("Boa tarde"); break;
            case "n":
            case "N": System.out.println("Boa noite"); break;
            default: System.out.println("Valor inválido"); break;
        }
    }
}
