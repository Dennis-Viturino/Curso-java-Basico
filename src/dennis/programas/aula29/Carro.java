public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel; 
    double consumoCombustivel;

    Carro() {
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;
    }

    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
        this.marca = marca_;
        this.modelo = modelo_;
        this.numPassageiros = numPassageiros_;
        this.capCombustivel = capCombustivel_;
        this.consumoCombustivel = consumoCombustivel_;
    }

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
