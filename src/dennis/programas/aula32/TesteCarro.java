package src.dennis.programas.aula32;

public class TesteCarro {
    public static void main(String[] args) {
        
        Carro van = new Carro();

        van.setMarca("Fiat");
        String marca = van.getMarca();

        System.out.println("A marca do carro é " + marca);
        System.out.println(van.getMarca());

    }
}
