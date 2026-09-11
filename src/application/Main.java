package application;

import entities.Agendamento;
import entities.enums.IdSalas;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Agendamento> agendamentos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Agendamento agendamento = null;

        boolean repetir = true;

        while(repetir == true) {
            System.out.println("===== AGENDAMENTOS =====");
            System.out.println("1 - Fazer um Agendamento");
            System.out.println("2 - Cancelar um Agendamento");
            System.out.println("3 - Verificar um Agendamento");
            System.out.println("4 - Fechar Menu");
            System.out.println("Escolha uma das opções a cima:");
            int escolhaMenu = input.nextInt();
            input.nextLine();

            switch (escolhaMenu) {
                case 1:
                    Random random = new Random();
                    int numeroIdAgendamento = random.nextInt(5000);
                    System.out.println("== ID AGENDAMENTO: "+numeroIdAgendamento+" ==");
                    System.out.println("== Salas da Unidade: ");
                    System.out.println(Arrays.toString(IdSalas.values()));
                    System.out.println("Digite uma das salas acima: ");
                    IdSalas escolhaSala = IdSalas.valueOf(input.nextLine());
                    System.out.println("");
                    agendamentos.add(agendamento = new Agendamento(numeroIdAgendamento,escolhaSala,));
                    break;
            }


        }

    }
}
