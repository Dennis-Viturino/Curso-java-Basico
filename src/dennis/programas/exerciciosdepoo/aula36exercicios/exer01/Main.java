package src.dennis.programas.exerciciosdepoo.aula36exercicios.exer01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome da Agenda");
        String nome = sc.nextLine();

        Agenda agenda = new Agenda(nome);
        //Agenda agenda2 = new Agenda();
        //agenda2.setNome(nome);

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < contatos.length; i++) {
            System.out.println("Digite as informações do contato " + (i+1));
            Contato c = new Contato();

            System.out.println("Entre com o nome");
            nome = sc.nextLine();
            c.setNome(nome);

            System.out.println("Entre com o telefone");
            String telefone = sc.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o email");
            String email = sc.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }
        
        agenda.setContatos(contatos);
        if (agenda != null) {
            System.out.println(agenda.toString());
        }

        sc.close();
    }
}
