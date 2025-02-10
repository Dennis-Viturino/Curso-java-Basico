package src.dennis.programas.exerciciosdepoo.aula34exercicios.exer01;

public class Main {

    public static void imprimeValor() {
        System.out.println(Contador.getCont());
    }
    public static void main(String[] args) {
        
        imprimeValor();
        
        Contador.incrementar();

        imprimeValor();

        Contador.zerar();

        imprimeValor();

        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        imprimeValor();

        // Contador c1 = new Contador();
        // Contador c2 = new Contador();

        imprimeValor();
    }
}
