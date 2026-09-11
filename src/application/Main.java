package application;

import entities.Agendamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Agendamento> agendamentos = new ArrayList<>();
        Scanner input = new Scanner(System.in);

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
                    System.out.println("Escolha uma das salas disponíveis: ");

                    break;
            }


        }

    }
}
