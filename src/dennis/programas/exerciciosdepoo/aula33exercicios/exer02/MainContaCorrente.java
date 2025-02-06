package src.dennis.programas.exerciciosdepoo.aula33exercicios.exer02;

public class MainContaCorrente {
    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();
        conta.setNumero("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setValorEspecialUsado(0);
        conta.setSaldo(-10);

        System.out.println("Saldo da conta " + conta.getNumero() + " = " + conta.getSaldo());

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual da conta = " + conta.getSaldo());
        } else {
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente");
        }

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais");
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual da conta = " + conta.getSaldo());
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
