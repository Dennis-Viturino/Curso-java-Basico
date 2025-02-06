package src.dennis.programas.aula31;

// sem o public, apenas quem estiver nesse pacote terá acesso a essa classe
class Carro {

    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
    }

    public void exibirCarro() {
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.numPassageiros);
    }

    public void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }

    public Carro() {}

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    public double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return this.capCombustivel * this.consumoCombustivel; // uso o return caso eu queira salvar um valor
    }

    public double calculaCombustivel(double km) {
        double qtdCombustivel = km / this.consumoCombustivel;
        return qtdCombustivel;
    }
}
