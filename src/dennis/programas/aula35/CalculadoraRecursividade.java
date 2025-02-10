package src.dennis.programas.aula35;

public class CalculadoraRecursividade {

    public static int fatorialNaoRecursivo(int num) {
        if (num != 0) {
            int valor = 1;
            for (int i = num; i > 1; i--) {
                valor *= i;
            }
            return valor;
        }
        return 0;
    }

    public static int fatorialRecursivo(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fatorialRecursivo(num - 1);
    }

}
