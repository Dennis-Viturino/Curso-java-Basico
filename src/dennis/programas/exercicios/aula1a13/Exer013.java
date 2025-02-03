package src.dennis.programas.exercicios.aula1a13;

import java.util.Scanner;

public class Exer013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesoIdeal;

        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();
        System.out.println("Digite seu sexo: masculino ou feminino");
        String sexo = sc.next();

        if (sexo.equals("masculino")) {
            pesoIdeal = (72.7 * altura) - 58; 
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.println("Digite seu peso atual");
        double peso = sc.nextDouble();

        if (peso == pesoIdeal) {
            System.out.println("Voçê está dentro do seu peso ideal.");
        } else if (peso > pesoIdeal) {
            System.out.println("Voçê está acima do seu peso ideal");
        } else {
            System.out.println("Voçê está abaixo do seu peso ideal");
        }
        sc.close();
    }
}
