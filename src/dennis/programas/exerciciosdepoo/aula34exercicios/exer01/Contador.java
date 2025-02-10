package src.dennis.programas.exerciciosdepoo.aula34exercicios.exer01;

public class Contador {

    /*  como o atributo cont é static, ele será o mesmo para todas as instancias
     *  logo todas as vezes que chamo o construtor Contador(), a variavel não muda para cada um
     */
    private static int cont;

    public Contador() {
        cont++;
    }

    public static void incrementar() {
        cont++;
    }

    public static void zerar() {
        cont = 0;
    }

    public static int getCont() {
        return cont;
    }
}
