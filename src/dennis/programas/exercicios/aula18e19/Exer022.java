package src.dennis.programas.exercicios.aula18e19;

public class Exer022 {
    public static void main(String[] args) {
        
        int[] vetorA = new int[10];
        int conta1 = 0;
        int conta0 = 0;
        int percentZeros;
        int percentUns;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);

            //math.random gera um número de 0 a 1 apertando ctrl + espaço mostra a documentação

            if (vetorA[i] == 1) {
                conta1++;
            } else if (vetorA[i] == 0) {
                conta0++;
            }
        }

        // descobrir a porcentagem faz assim:
        
        percentZeros = ((conta0 * 100) / vetorA.length);
        percentUns = ((conta1 * 100) / vetorA.length);

        System.out.print("Vetor A =");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("O percentual de 0 é: " + percentZeros + "%");
        System.out.println("O percentual de 1 é: " + percentUns + "%");
        
    }
}
