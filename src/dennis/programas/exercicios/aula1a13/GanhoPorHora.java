package src.dennis.programas.exercicios.aula1a13;

import java.util.Scanner;

public class GanhoPorHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o quanto voçê ganha por horas trabalhadas");
        double umaHora = sc.nextDouble();
        System.out.println("Agora digite quantas horas voçê trabalha por mês:");
        double horasPorMes = sc.nextDouble();
        System.out.println("O total de seu salário por mês é: " + (horasPorMes * umaHora));
        
    }
}
