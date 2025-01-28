package src.dennis.programas.exercicios.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = 1000; // 95

        double percentual = 1.5;

        salario += (salario / 100) * percentual; // 96

        DecimalFormat format = new DecimalFormat("###,###.##");

        for (int i = 1997; i <= 2015; i++) {

            percentual *= 2;

            salario += (salario / 100) * percentual;

            System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");

        }

    }
}
