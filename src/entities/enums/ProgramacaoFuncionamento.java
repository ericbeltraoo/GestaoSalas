package entities.enums;

import java.time.LocalTime;

public enum ProgramacaoFuncionamento {
    SEGUNDA(LocalTime.of(8,0), LocalTime.of(16,0)),
    TERCA(LocalTime.of(8,0), LocalTime.of(18,0)),
    QUARTA(LocalTime.of(8,0), LocalTime.of(18,0)),
    QUINTA(LocalTime.of(8,0), LocalTime.of(18,0)),
    SEXTA(LocalTime.of(8,0), LocalTime.of(16,0));

    private final LocalTime horaAbertura;
    private final LocalTime horaFechamento;

    ProgramacaoFuncionamento(LocalTime horaAbertura, LocalTime horaFechamento) {
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
    }

    public LocalTime getHoraAbertura() {
        return horaAbertura;
    }

    public LocalTime getHoraFechamento() {
        return horaFechamento;
    }


}
