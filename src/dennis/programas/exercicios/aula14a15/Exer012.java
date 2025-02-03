package src.dennis.programas.exercicios.aula14a15;

import java.util.Scanner;

public class Exer012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o valor hora");
        double valorHora = sc.nextDouble();

        System.out.println("Entre com as horas trabalhadas no mês");
        double qtdHoras = sc.nextDouble();

        double salarioBruto = valorHora * qtdHoras;

        int percentualIR = 0;
        if (salarioBruto <= 900) {
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            percentualIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIR = 10;
        } else if (salarioBruto > 2500) {
            percentualIR = 20;
        }

        double impostoRenda = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = impostoRenda + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHoras + "): R$ " + salarioBruto);
        System.out.println("(-) IR (" + percentualIR + "%): R$" + impostoRenda);
        System.out.println("(-) INSS (10%): R$ " + inss);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos : R$ " + totalDescontos);
        System.out.println("Salário Liquído: R$ " + salarioLiquido);
        sc.close();
    }
}