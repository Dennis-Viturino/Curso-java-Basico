package src.dennis.programas.exerciciosdepoo.aula35exercicios.exer02;

public class Somatorio {

    public static int somatorio(int num) {

        if (num == 1) {
            return 1;
        }
        return num + somatorio(num - 1);
    }

}
