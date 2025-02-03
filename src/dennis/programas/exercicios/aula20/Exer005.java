package src.dennis.programas.exercicios.aula20;

import java.util.Scanner;

public class Exer005 {
    public static void main(String[] args) {

        // código que simula uma agenda automatizada, onde considera 12 mesees, 31 dias e 24 horas cada dia

        Scanner sc = new Scanner(System.in);

        String[][][] compromissos = new String[12][31][8];

        boolean sair = false;
        int opcao;
        while (!sair) {
            
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");

            opcao = sc.nextInt();

            if (opcao == 1) { // adicionar compromisso

                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Entre com o mês do ano");
                    mes = sc.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente");
                    }
                }
                
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
                    if (hora >= 0 && hora <= 8) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }

                mes--;
                dia--; // para poder acessar de 0 a 30 dias incluindo o dia 31
                System.out.println("Digite o compromisso");
                compromissos[mes][dia][hora] = sc.next();

            } else if (opcao == 2) { // verificar  compromisso

                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Entre com o mês do ano");
                    mes = sc.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente");
                    }
                }
                
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

                mes--;
                dia--;
                System.out.println("O compromisso agendado é ");
                System.out.println(compromissos[mes][dia][hora]);
                

            } else if (opcao == 0) { 
                sair = true;
            } else {
                System.out.println("Opção inválida, digite novamente");
            }

        }
        sc.close();
    }
}
