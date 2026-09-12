package application;

import entities.Agendamento;
import entities.enums.IdSalas;
import entities.enums.ProgramacaoFuncionamento;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Agendamento> agendamentos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Agendamento agendamento = null;
        IdSalas idSalas = null;

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
                    for(IdSalas sala : IdSalas.values()) {
                        System.out.print(sala+" | ");
                    }
                    System.out.println();

                    System.out.println("Digite a numeração de uma das salas acima: ");
                    int numeracaoSala = input.nextInt();
                    input.nextLine();

                    switch (numeracaoSala) {
                        case 1 -> idSalas = IdSalas.SALA_01;
                        case 2 -> idSalas = IdSalas.SALA_02;
                        case 3 -> idSalas = IdSalas.SALA_03;
                        case 4 -> idSalas = IdSalas.SALA_04;
                        case 5 -> idSalas = IdSalas.SALA_05;
                        case 6 -> idSalas = IdSalas.SALA_06;
                        case 7 -> idSalas = IdSalas.SALA_07;
                        case 8 -> idSalas = IdSalas.SALA_08;
                        case 9 -> idSalas = IdSalas.SALA_09;
                        case 10 -> idSalas = IdSalas.SALA_10;
                        default -> System.out.println("ERRO: Sala inválida, verifique a lista e escolha uma opção.");
                    }

                    System.out.println("== Dias e Horários: ");
                    System.out.printf("%s, Abertura: %s - Fechamento: %s%n",ProgramacaoFuncionamento.SEGUNDA,ProgramacaoFuncionamento.SEGUNDA.getHoraAbertura(),ProgramacaoFuncionamento.SEGUNDA.getHoraFechamento());
                    System.out.printf("%s, Abertura: %s - Fechamento: %s%n",ProgramacaoFuncionamento.TERCA,ProgramacaoFuncionamento.TERCA.getHoraAbertura(),ProgramacaoFuncionamento.TERCA.getHoraFechamento());
                    System.out.printf("%s, Abertura: %s - Fechamento: %s%n",ProgramacaoFuncionamento.QUARTA,ProgramacaoFuncionamento.QUARTA.getHoraAbertura(),ProgramacaoFuncionamento.QUARTA.getHoraFechamento());
                    System.out.printf("%s, Abertura: %s - Fechamento: %s%n",ProgramacaoFuncionamento.QUINTA,ProgramacaoFuncionamento.QUINTA.getHoraAbertura(),ProgramacaoFuncionamento.QUINTA.getHoraFechamento());
                    System.out.printf("%s, Abertura: %s - Fechamento: %s%n",ProgramacaoFuncionamento.SEXTA,ProgramacaoFuncionamento.SEXTA.getHoraAbertura(),ProgramacaoFuncionamento.SEXTA.getHoraFechamento());
                    System.out.println("Digite o dia para o agendamento: ");
                    String diaFuncionamento = input.nextLine();

                    ProgramacaoFuncionamento programacaoFuncionamento = null;

                    switch (diaFuncionamento.toUpperCase()) {
                        case "SEGUNDA" -> programacaoFuncionamento = ProgramacaoFuncionamento.SEGUNDA;
                        case "TERCA" -> programacaoFuncionamento = ProgramacaoFuncionamento.TERCA;
                        case "QUARTA" -> programacaoFuncionamento = ProgramacaoFuncionamento.QUARTA;
                        case "QUINTA" -> programacaoFuncionamento = ProgramacaoFuncionamento.QUINTA;
                        case "SEXTA" -> programacaoFuncionamento = ProgramacaoFuncionamento.SEXTA;
                        default -> System.out.println("ERRO: Dia inválido, verifique a lista e escolha uma opção.");
                    }
//                    System.out.println("");
//                    agendamentos.add(agendamento = new Agendamento(numeroIdAgendamento,escolhaSala,));
                    break;
            }


        }

    }
}
