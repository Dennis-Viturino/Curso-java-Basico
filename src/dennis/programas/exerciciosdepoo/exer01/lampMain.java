package src.dennis.programas.exerciciosdepoo.exer01;

public class lampMain {
    public static void main(String[] args) {
        
        Lampada lampada = new Lampada();

        lampada.ligarLampada();
        lampada.mostrarEstado();

        lampada.desligarLampada();
        lampada.mostrarEstado();

        lampada.mudarEstado();
        lampada.mostrarEstado();

    }
}
