package src.dennis.programas.exercicios.aula17;

import java.util.Scanner;

public class Exer025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lojas Tabajara");

        boolean sair = false;
        String continuarCompra;
        int qtdProdutos;
        double preco;
        double total;
        String output;
        double valorPago;
        double troco;

        do {
            System.out.println("Deseja começar uma nova compra? (S/N)");
            continuarCompra = sc.next();

            if (continuarCompra.equalsIgnoreCase("s")) {

                output = "Lojas Tabajara\n";

                System.out.println("Quantidade de produtos");
                qtdProdutos = sc.nextInt();

                total = 0;

                for (int i = 1; i<= qtdProdutos; i++) {
                    System.out.println("Informe preço do produto " + i);
                    preco = sc.nextDouble();
                    total += preco;


                    output += "Produto " + i + ": R$ " + preco + "\n";
                }

                output += "Total: R$ " + total + "\n";

                System.out.println("Total: R$" + total);

                System.out.println("Entre com o valor pago");
                valorPago = sc.nextDouble();

                output += "Dinheiro: R$ " + valorPago + "\n";

                troco = valorPago - total;

                output += "Troco: R$ " + troco;

                System.out.println(output);

            } else {
                sair = true;
            }
            
        } while (!sair);
        sc.close();
    }
}
