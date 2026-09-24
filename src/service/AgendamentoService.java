package service;

import entities.Agendamento;
import entities.enums.IdSalas;

import java.time.Duration;
import java.util.List;

public class AgendamentoService {
    public static final int TEMPO_MINIMO_RESERVA = 30;

    //verificação se um agendamento entra em conflito com outro
    //antigo = a , novo = b;
    public boolean possuiConflito(List<Agendamento> agendamentos, Agendamento novo) {
        boolean verificacao = false;
        for(Agendamento existentes : agendamentos) {
            if(existentes.getSalaId() == novo.getSalaId()) {
                 if(existentes.getInicio().isBefore(novo.getFim()) && novo.getInicio().isBefore(existentes.getFim())) {
                   verificacao = true;
                 } else {
                    verificacao = false;
                 }
             } else {
                // a sala nao é igual, entao nao tem como o horario ser conflitado.
               verificacao = false;
            }
        }
      return verificacao;
    }

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
