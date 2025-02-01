package src.dennis.programas;

import java.text.DecimalFormat;

public class Matrizes {
    public static void main(String[] args) {

        // O primeiro [] é para as linhas já o segundo [] é para as colunas
        double[][] notasAlunos = new double[3][4];
        double media;
        DecimalFormat formatandoMedia = new DecimalFormat("###,###.#");

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        // É assim que se imprime uma mátriz

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " - ");
            }
            System.out.println();
        }

        notasAlunos[1][3] = 8;

        System.out.println();

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " - ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Calculando a média");

        for (int i = 0; i < notasAlunos.length; i++) {

            media = 0;

            for (int j = 0; j < notasAlunos[i].length; j++) {
                media += notasAlunos[i][j];
            }

            media = media / notasAlunos[i].length;

            System.out.println("A média do aluno " + (i+1) + " é " + formatandoMedia.format(media));

        }

        System.out.println();

        // assim innicializa um vetor diretamente
        double[] notasAluno1 = {7, 8, 9, 10};

        // assim innicializa uma matriz diretamente
        double[][] notasDeDoisAlunos = {{7, 8, 9, 10}, {8, 6, 7, 10}};

        System.out.println("Visualize o codigo pois esse print é sobre inicialização direta");
        for (int i = 0; i < notasDeDoisAlunos.length; i++) {
            for (int j = 0; j < notasDeDoisAlunos[i].length; j++) {
                System.out.print(notasDeDoisAlunos[i][j] + " ");
            }
            System.out.println();
        }

    }
}
