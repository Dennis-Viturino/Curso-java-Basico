package src.dennis.programas.aula30;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() {

    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtoro com 3 parametros");
    }

    public Carro(String marca, String modelo) { // this chamando outro construtor dentro do construtor
        this(marca, modelo, 10);
        System.out.println("Chamando o construtoro com 2 parametros");
    }

    // nome de metodo em java sempre começa com verbo, Ações.
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return this.capCombustivel * this.consumoCombustivel; // uso o return caso eu queira salvar um valor
    }

    double calculaCombustivel(double km) {
        double qtdCombustivel = km / this.consumoCombustivel;
        return qtdCombustivel;
    }
}
