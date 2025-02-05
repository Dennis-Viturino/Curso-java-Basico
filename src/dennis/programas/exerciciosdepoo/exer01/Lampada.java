package src.dennis.programas.exerciciosdepoo.exer01;

public class Lampada {

    String modelo;
    String tensão;
    int potencia;
    String cor;
    String tipoLuz;
    int garantia;
    String[] tipos; // no array tem que colocar nome.tipos = new String[valor]
    
    boolean ligada;

    void ligarLampada() {
        ligada = true;
    }

    void desligarLampada() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("A lampada está ligada");
        } else {
            System.out.println("A lampada está desligada");
        }
    }

    void mudarEstado() {
        if (ligada) {
            desligarLampada();
        } else {
            ligarLampada();
        }
    }
}
