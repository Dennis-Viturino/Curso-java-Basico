package src.dennis.programas.exerciciosdepoo.exer02;

public class ContaCorrenteMain {
    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual da conta = " + conta.saldo);
        } else {
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente");
        }

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais");
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual da conta = " + conta.saldo);
        } else {
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente");
        }

        conta.depositarDinheiro(1000);
        conta.consultarSaldo();

        conta.verificarUsoChequeEspecial();

        conta.realizarSaque(1100);
        conta.consultarSaldo();
        conta.verificarUsoChequeEspecial();

    }
}
