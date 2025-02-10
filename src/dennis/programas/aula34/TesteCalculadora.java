package src.dennis.programas.aula34;

public class TesteCalculadora {

    static int resultadoSoma;
    public static void main(String[] args) {
        
        //MinhaCalculadora calc = new MinhaCalculadora();
        //System.out.println(calc.soma(1, 2));
        
        resultadoSoma = MinhaCalculadora.soma(1, 2);
        soma2Valores(3, 4);
    }

    static int soma2Valores(int num1, int num2) {
        return MinhaCalculadora.soma(num1, num2);
    }

}
