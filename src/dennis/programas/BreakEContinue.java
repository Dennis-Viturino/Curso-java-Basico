package src.dennis.programas;

import java.util.Scanner;

public class BreakEContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = sc.nextInt();

        System.out.println("Digite um limite");
        int max = sc.nextInt();

        for (int i = num; i <= max; i++) {
            System.out.println(i);
            if (i % 7 == 0) {
                System.out.println("O primeiro número divisivel por 7 é: " + i);
                break;
            } 
        }

        // tambem tem o continue, mais é mais usado quando temos for dentro de for
        // exemplo, dentro do segundo for quero que pule o segundo e va pra o for externo,
        // usa o continue
        sc.close();
    }
}
