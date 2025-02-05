package src.dennis.programas.aula01ateaula23;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*  um programa que irá ler os dias da semanas de 
        acordo com a entrada, cada numero será um dia da semana
        e deve-se imprimir o nome do dia correspondente ao valor */

        System.out.println("Entre com um dia da semana (1-7):");

        int diaSemana = sc.nextInt();

        switch(diaSemana) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Não é um dia da semana válido");
        }

        // Outra maneira de usar o switchcase é assim

        switch(diaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("Dia útil"); break;
            case 1:
            case 7: System.out.println("Fim de semana"); break;
            default: System.out.println("Não é um dia da semana válido");
        }
        sc.close();
    }
}
