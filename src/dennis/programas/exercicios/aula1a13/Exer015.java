package src.dennis.programas.exercicios.aula1a13;

import java.util.Scanner;

public class Exer015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o quanto voçê ganha por horas trabalhadas");
        double umaHora = sc.nextDouble();

        System.out.println("Agora digite quantas horas voçê trabalha por mês:");
        double horasPorMes = sc.nextDouble();

        double salarioBruto = horasPorMes * umaHora;

        double inss = (salarioBruto/100) * 8;
        double sindicato = (salarioBruto/100) * 5;
        double impostoRenda = (salarioBruto/100) * 11;
        double totalDescontos = inss + sindicato + impostoRenda;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("O total de seu salário bruto por mês é: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("Imposto de Renda: " + impostoRenda);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário liquido é de: " + salarioLiquido);
        sc.close();
    }
}
