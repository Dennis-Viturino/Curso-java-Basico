package src.dennis.programas.exercicios.aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "";
        int codigo;
        double preco = 0;
        int qtdItem;
        double totalPorProduto = 0;
        double totalGeral = 0;
        boolean continuarPedindo = true;
        String encerrarPedido;
        boolean codigoValido;
        double dineheiroPago;

        DecimalFormat format = new DecimalFormat("###,###.##");

        System.out.println("      Iniciando um novo pedido\n");

        System.out.println("        A Tabela de Preços");
        System.out.println("Especificação     Código  Preço");
        System.out.println("Cachorro Quente   100     R$ 1,20");
        System.out.println("Bauru Simples     101     R$ 1,30");
        System.out.println("Bauru com ovo     102     R$ 1,50");
        System.out.println("Hambúrguer        103     R$ 1,20");
        System.out.println("CheeseBurguer     104     R$ 1,30");
        System.out.println("Refrigerante      105     R$ 1,00");
        System.out.println("");

        do {

            codigoValido = true;
            totalPorProduto = 0;

            System.out.println("Digite o código do produto");
            codigo = sc.nextInt();

            switch (codigo) {
                case 100: nome = "Cachorro Quente"; preco = 1.20; break;
                case 101: nome = "Bauru Simples"; preco = 1.30; break;
                case 102: nome = "Bauru com ovo"; preco = 1.50; break;
                case 103: nome = "Hambúrguer"; preco = 1.20; break;
                case 104: nome = "Cheeseburguer"; preco = 1.30; break;
                case 105: nome = "Refrigerante"; preco = 1.00; break;
                default: System.out.println("Voçê digitou um codigo inválido"); codigoValido = false;
            }

            if (codigoValido == true) {
                
                System.out.println("Digite a quantidade de " + nome);
                qtdItem = sc.nextInt();

                totalPorProduto = (preco * qtdItem);
                System.out.println("O total desse produto é: " + format.format(totalPorProduto));

                totalGeral += totalPorProduto;

                System.out.println("Deseja Mais alguma coisa?");
                System.out.println("Digite 1 para Sim ou digite 2 para Não");
                encerrarPedido = sc.next();

                switch (encerrarPedido) {
                    case "n":
                    case "2": continuarPedindo = false; break;
                    default: continuarPedindo = true; System.out.println("Voçê escolheu continuar comprando");
                }

            }
        } while(continuarPedindo);

        System.out.println("O valor total de seu pedido é: R$" + format.format(totalGeral));
        System.out.println("Digite o valor do pagamento em dinheiro");
        dineheiroPago = sc.nextDouble();

        System.out.println("A sua compra foi realizada com sucesso, seu troco é: R$" + (format.format(dineheiroPago - totalGeral)));
        sc.close();
    }
}
