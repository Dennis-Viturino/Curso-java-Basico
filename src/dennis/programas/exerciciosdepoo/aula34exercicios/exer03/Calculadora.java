package src.dennis.programas.exerciciosdepoo.aula34exercicios.exer03;

public class Calculadora {

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int potencia(int num1, int num2) {
        int total = 1;
        for (int i = 1; i <= num2; i++) {
            total *= num1;
        }
        return total;
    }

    public static int fatorial(int num) {
        if (num != 0) {
            int valor = 1;
            for (int i = num; i > 1; i--) {
                valor *= i;
            }
            return valor;
        }
        return 0;
    }
}
