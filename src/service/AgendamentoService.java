package service;

import entities.Agendamento;
import entities.enums.IdSalas;

import java.time.Duration;
import java.util.List;

public class AgendamentoService {
    public static final int TEMPO_MINIMO_RESERVA = 30;

    //verificação se um agendamento entra em conflito com outro
//    public boolean possuiConflito(List<Agendamento> agendamentos) {
//        for(Agendamento x : agendamentos) {
//            x.getSalaId()
//        }
//    }

    public long calcularHorasTotaisFormatadas(List<Agendamento> agendamentos, IdSalas idSalas) {
        Duration duracao = null;
        long somaDuracao = 0;
        for(Agendamento x : agendamentos) {
            if(x != null && idSalas != null) {
                if(x.getSalaId() == idSalas) {
                    duracao = Duration.between(x.getInicio(),x.getFim());
                }
                somaDuracao = somaDuracao + duracao.toMinutes();
            }

        }
        return somaDuracao;
    }

}
