package src.dennis.programas.exerciciosdepoo.aula34exercicios.exer03;

public class MainCalculadora {

    public static void imprimeValor(int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {
        
        imprimeValor(Calculadora.soma(1, 3));

        imprimeValor(Calculadora.subtrair(1, 3));

        imprimeValor(Calculadora.dividir(4, 2));

        imprimeValor(Calculadora.multiplicar(2, 4));

        imprimeValor(Calculadora.potencia(5, 2));

        imprimeValor(Calculadora.fatorial(5));

    }

}
