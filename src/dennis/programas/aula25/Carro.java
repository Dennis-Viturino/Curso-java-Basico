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
}
