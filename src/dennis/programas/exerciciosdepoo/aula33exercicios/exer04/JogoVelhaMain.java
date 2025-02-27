package src.dennis.programas.exerciciosdepoo.aula33exercicios.exer04;

import java.util.Scanner;

public class JogoVelhaMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        JogoVelha jogoDaVelha = new JogoVelha();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {
            
            if (jogoDaVelha.vezJogador1()) { 

                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
                sinal = 'X';

            } else { 

                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
                sinal = 'O';
            }

            linha = valor("linha", sc);
            coluna = valor("coluna", sc);

            if (!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
                System.out.println("Posição já usada, tente novamente");
            }

            jogoDaVelha.imprimirTabuleiro();

            if (jogoDaVelha.verificarGanhador('X')) {
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if (jogoDaVelha.verificarGanhador('O')) {
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");
            } else if (jogoDaVelha.getJogada() > 9) {
                ganhou = true;
                System.out.println("Nínguem ganhou está partida");
            }
        }
    }

        static int valor(String tipoValor, Scanner sc) {
            int valor = 0;
            boolean valorValida = false;
            while (!valorValida) {
                System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
                valor = sc.nextInt();
                if (valor >= 1 && valor <= 3) {
                    valorValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente");
                }
            }
            valor--;
            return valor;
        }
}
