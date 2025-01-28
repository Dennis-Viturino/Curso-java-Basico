package src.dennis.programas;

public class TiposPrimitivos {
    public static void main(String[] args) {
        
        // usando inteiros e ponto flutuantes

        int valor1 = 15;
        long valor2 = 20l;

        System.out.println(valor1);
        System.out.println(valor2);
        
        float saldo1 = 100.30f;
        double saldo2 = 100.30;

        System.out.println(saldo1);
        System.out.println(saldo2);

        // char e aspas simples para somar valor de caracteres

        char o = 'o';
        char i = 'i';

        System.out.println(o > i);

        // Também temos o tipo boolean que recebe true or false

        boolean vedade = true;
        boolean falso = false;

        System.out.println(vedade);
        System.out.println(falso);

        // Numeros hexadecimais, octais, e binarios

        int decimal = 26;
        int hexadecimal = 0x1a; // 26 em hexadecimal
        int octal = 032; // 26 em octal
        int binario = 0b11010;

        System.out.println((decimal == hexadecimal) == (octal == binario));

        /* Sequência de Escape temos o seguinte
            \n isso vai pra linha de baixo
            \r isso trás o cursor para trás
            \' isso coloca aspa
            \" isso coloca aspas duplas
            \\ ossp coloca a barra invertida

            todos esses servem pra o print, são para formatação
        */ 
    }
}
