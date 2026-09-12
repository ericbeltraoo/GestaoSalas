package entities.enums;

public enum IdSalas {
    SALA_01("Sala 1"),
    SALA_02("Sala 2"),
    SALA_03("Sala 3"),
    SALA_04("Sala 4"),
    SALA_05("Sala 5"),
    SALA_06("Sala 6"),
    SALA_07("Sala 7"),
    SALA_08("Sala 8"),
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
