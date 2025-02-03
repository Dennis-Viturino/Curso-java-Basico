package src.dennis.programas.exercicios.aula20;

import java.util.Scanner;

public class Exer004 {
    public static void main(String[] args) {

        // código que simula uma agenda automatizada, onde considera 31 dias e 24 horas cada dia

        Scanner sc = new Scanner(System.in);

        String[][] compromissos = new String[31][24];

        boolean sair = false;
        int opcao;
        while (!sair) {
            
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");

            opcao = sc.nextInt();

            if (opcao == 1) { // adicionar compromisso
                
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = sc.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }

                boolean horaValido = false;
                int hora = 0;
                while (!horaValido) {
                    System.out.println("Entre com o hora do compromisso");
                    hora = sc.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }

                dia--; // para poder acessar de 0 a 30 dias incluindo o dia 31
                System.out.println("Digite o compromisso");
                compromissos[dia][hora] = sc.next();

            } else if (opcao == 2) { // verificar  compromisso
                
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = sc.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }

                boolean horaValido = false;
                int hora = 0;
                while (!horaValido) {
                    System.out.println("Entre com o hora do compromisso");
                    hora = sc.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }

                dia--;
                System.out.println("O compromisso agendado é ");
                System.out.println(compromissos[dia][hora]);
                

            } else if (opcao == 0) { 
                sair = true;
            } else {
                System.out.println("Opção inválida, digite novamente");
            }

        }
        sc.close();
    }
}
