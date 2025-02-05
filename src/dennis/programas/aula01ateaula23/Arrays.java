package src.dennis.programas.aula01ateaula23;

public class Arrays {
    public static void main(String[] args) {
        
        // A solução para armazenar uma lista de dados é usar arrays
        // array = lista ordenada

        //para usar arrays, colocar o tipo e depois [], = new tipo[qtdposições]

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);

        System.out.println("O tamanho do array: " + temperaturas.length);

        // imprimir um array, ou interar um array usando indice

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i+1) + " é " + temperaturas[i]);
        }

        // for melhorado usando arrays abaixo: é como um for de algo in algo

        for(double temp : temperaturas) {
            System.out.println(temp);
        }

    }
}
