package src.dennis.programas.exerciciosdepoo.aula33exercicios.exer01;

public class MainLampada {
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
