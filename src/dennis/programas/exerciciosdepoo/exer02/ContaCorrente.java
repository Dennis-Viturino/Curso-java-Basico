package src.dennis.programas.exerciciosdepoo.exer02;

public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double quantiaASacar) { 

        // tem saldo na conta
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else { // não tem saldo na conta
            if (especial) { 
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    void depositarDinheiro(double quantiaADepositar) {
        saldo += quantiaADepositar;
        System.out.println(quantiaADepositar + "R$ depositados com sucesso. Seu saldo é " + saldo + "R$");
    }

    void consultarSaldo() {
        System.out.println(saldo + "R$");
    }

    void verificarUsoChequeEspecial() {
        if (saldo < 0) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
    }
}
