package entities.enums;

public enum IdSalas {
    SALA_01("Sala 1 - Auditório"),
    SALA_02("Sala 2 - Auditório"),
    SALA_03("Sala 3 - Sala de Reunião"),
    SALA_04("Sala 4 - Sala de Reunião"),
    SALA_05("Sala 5 - Sala de Estudos"),
    SALA_06("Sala 6 - Sala de Descanço"),
    SALA_07("Sala 7 - Sala Executiva"),
    SALA_08("Sala 8 - Sala Executiva"),
    SALA_09("Sala 9"),
    SALA_10("Sala 10");

    private final String nomeExibicao;

    IdSalas(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    @Override
    public String toString() {
        return nomeExibicao;
    }
}
