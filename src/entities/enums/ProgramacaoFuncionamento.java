package entities.enums;

import java.time.DayOfWeek;
import java.time.LocalTime;

public enum ProgramacaoFuncionamento {
    SEGUNDA(LocalTime.of(8,0), LocalTime.of(16,0),DayOfWeek.MONDAY),
    TERCA(LocalTime.of(8,0), LocalTime.of(18,0),DayOfWeek.TUESDAY),
    QUARTA(LocalTime.of(8,0), LocalTime.of(18,0),DayOfWeek.WEDNESDAY),
    QUINTA(LocalTime.of(8,0), LocalTime.of(18,0),DayOfWeek.THURSDAY),
    SEXTA(LocalTime.of(8,0), LocalTime.of(16,0),DayOfWeek.FRIDAY);

    private final LocalTime horaAbertura;
    private final LocalTime horaFechamento;
    private final DayOfWeek diaDaSemana;

    ProgramacaoFuncionamento(LocalTime horaAbertura, LocalTime horaFechamento, DayOfWeek diaDaSemana) {
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.diaDaSemana = diaDaSemana;
    }

    public LocalTime getHoraAbertura() {
        return horaAbertura;
    }

    public LocalTime getHoraFechamento() {
        return horaFechamento;
    }

    public DayOfWeek getDiaDaSemana() {
        return diaDaSemana;
    }


}
