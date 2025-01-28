package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letra = sc.next();
        if (letra.length() > 1) {
            System.out.println("Não é uma letra válida");
        } else {
            switch (letra) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                case "a":
                case "e":
                case "i":
                case "o":
                case "u": System.out.println("É uma vogal"); break;
                default: System.out.println("É uma consoante"); break;
            }    
        }
    }
}
