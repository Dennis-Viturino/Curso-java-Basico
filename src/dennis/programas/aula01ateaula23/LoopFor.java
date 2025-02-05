package src.dennis.programas.aula01ateaula23;

public class LoopFor {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            System.out.println("O valor de i é: " + i);
        }

        System.out.println("");

        for (int i = 5; i >= 0; i--) {
            System.out.println("O valor de i é: " + i);
        }

        System.out.println("");

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i é igual a: " + i + "; j é igual a: " + j);
        }

        System.out.println("");

        int count = 0;
        for (; count < 10; ) {
            System.out.println("O valor de count: " + count);
            count += 2;
        }

        System.out.println("");

        for (int cont = 0; cont < 10; cont += 2) {
            System.out.println("O valor de cont é: " + cont);
        }
        
        int soma = 0;
        for (int i = 1; i < 5; soma += i++);
        System.out.println("O valor da soma é: " + soma);

    }
}
