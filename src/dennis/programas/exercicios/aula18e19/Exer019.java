package src.dennis.programas.exercicios.aula18e19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer019 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] resultados = new double[notas1.length];

        for (int i = 0; i < notas1.length; i ++) {
            System.out.println("Digite a primeira nota do aluno 0" + (i+1));
            notas1[i] = sc.nextDouble();

            System.out.println("Digite a segunda nota do aluno 0" + (i+1));
            notas2[i] = sc.nextDouble();

            resultados[i] = (notas1[i] + notas2[i]) / 2;
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.#");

        System.out.println("As notas finais da classe são ");
        System.out.println();
        for (int i = 0; i < resultados.length; i++) {

            System.out.println("Aluno 0" + (i + 1) + " Nota final: " + df.format(resultados[i]));

            if (resultados[i] >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            System.out.println();
        }
        sc.close();
    }
}
