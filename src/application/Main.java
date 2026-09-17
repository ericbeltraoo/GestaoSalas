package application;

import entities.Agendamento;
import entities.enums.IdSalas;
import entities.enums.ProgramacaoFuncionamento;

import java.time.*;
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
                    int contador = 0;
                    for(IdSalas sala : IdSalas.values()) {
                        System.out.print(sala+" | ");
                        contador++;
                        if(contador % 3 == 0) {
                            System.out.println();
                        }
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
                        default -> {
                            System.out.println("ERRO: Sala inválida, verifique a lista e escolha uma opção.");
                            continue;
                        }
                    }

                    // reformular para aparecer somente os estao disponiveis para reserva, ex: das 18 as 19, entendeu?
                    System.out.println("== Dias e Horários de funcionamento: ");
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
                        default -> {
                            System.out.println("ERRO: Dia inválido, verifique a lista e escolha uma opção.");
                            continue;
                        }
                    }

                     // armazena o ano (ex: 2027)

                    // preciso fazer um sistema com o mesmo estilo dos dias para o usuario escolher o mes que ele quer realizar
                    // o agendamento, so da para fazer no ano de 2026
                    // falta faze r o switch case do mes e do dia, no final tudo deve ficar um LocalDateTime para colocar na classe
                    // Agendamento
                    int ano = LocalDate.now().getYear();

                    List<Integer> mesesAno = new ArrayList<>();
                    System.out.println("== Definição do mes:");
                    for(int i = 1; i <= 12;i++) {
                        if(i >= YearMonth.now().getMonthValue()) {
                            mesesAno.add(i);
                            System.out.print(i+" - ");
                        }
                    }

                    System.out.println();
                    System.out.println("Escolha um dos meses disponíveis acima:");
                    int escolhaMes = input.nextInt();
                    input.nextLine();


                    Month mesAno; // armazena o nome do mes (ex: JANUARY)
                    switch (escolhaMes) {
                        case 1 -> mesAno = Month.JANUARY;
                        case 2 -> mesAno = Month.FEBRUARY;
                        case 3 -> mesAno = Month.MARCH;
                        case 4 -> mesAno = Month.APRIL;
                        case 5 -> mesAno = Month.MAY;
                        case 6 -> mesAno = Month.JUNE;
                        case 7 -> mesAno = Month.JULY;
                        case 8 -> mesAno = Month.AUGUST;
                        case 9 -> mesAno = Month.SEPTEMBER;
                        case 10 -> mesAno = Month.OCTOBER;
                        case 11 -> mesAno = Month.NOVEMBER;
                        case 12 -> mesAno = Month.DECEMBER;
                        default -> {
                            System.out.println("ERRO: Digite um mês válido.");
                            continue;
                        }
                    }


                    System.out.println("== Datas Disponíveis:");
                    List<LocalDate> diasTotaisMes = new ArrayList<>();
                    List<LocalDate> datasDiaSemana = new ArrayList<>(); // Dias somente do dia da semana escolhido
                    for(int i = 0; i < mesAno.maxLength();i++) {
                        LocalDate date = LocalDate.of(ano,mesAno,i+1);
                        diasTotaisMes.add(date);

                        if(diasTotaisMes.get(i).getDayOfWeek().equals(programacaoFuncionamento.getDiaDaSemana())) {
                            datasDiaSemana.add(diasTotaisMes.get(i));
                        }

                    }

                    for(LocalDate x : datasDiaSemana) {
                        System.out.print(x.getDayOfMonth()+" - ");
                    }
                    System.out.println();
                    System.out.println("Escolha uma das datas disponíveis acima");
                    int escolhaData = input.nextInt();
                    input.nextLine();

                    int diaAgendamento = 0;
                    for(LocalDate x : datasDiaSemana) {
                        if(escolhaData == x.getDayOfMonth()) {
                            diaAgendamento = escolhaData;
                        }
                    }

                    if(diaAgendamento == 0) {
                        System.out.println("ERRO: Digite um dia válido.");
                        continue;
                    }


                    System.out.println(programacaoFuncionamento.getHoraAbertura());
                    //LocalDateTime teste = LocalDateTime.of(ano,mesAno,diaAgendamento,programacaoFuncionamento.getHoraAbertura());
//                    System.out.println("");
                    //agendamentos.add(agendamento = new Agendamento(numeroIdAgendamento,idSalas,programacaoFuncionamento.getHoraAbertura().atDate(LocalDate.of()),programacaoFuncionamento.getHoraFechamento()));
                    break;
                case 4:
                    repetir = false;
            }


        }

    }
}
