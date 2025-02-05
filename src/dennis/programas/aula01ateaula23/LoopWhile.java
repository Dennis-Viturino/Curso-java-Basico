package src.dennis.programas.aula01ateaula23;

public class LoopWhile {
    public static void main(String[] args) {
        
        int i = 1; // count ou cont
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= max) {
            System.out.println("Valor de i: " + i);
            i++; // i += 1 ou i = i + 1
        }

        System.out.println(i); // tem valor de 11

        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 15);

        System.out.println(i);

        /*  o do while roda pelo menos uma vez, 
        já o while pode nem chegar a rodar no codigo */

    }
}
