package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letra = sc.next();
        switch (letra) {
            case "F":
            case "f":
                System.out.println("Feminino");
                break;
            case "M":
            case "m":
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Sexo inválido");
        }
    }
}
