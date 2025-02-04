package src.dennis.programas.aula25;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel; 
    double consumoCombustivel;

    // nome de metodo em java sempre começa com verbo, Ações.
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel; // uso o return caso eu queira salvar um valor
    }

    double calculaCombustivel(double km) {
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }


}
