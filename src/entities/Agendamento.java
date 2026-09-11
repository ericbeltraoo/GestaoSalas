package entities;

import entities.enums.IdSalas;

import java.time.LocalDateTime;

public class Agendamento {
    private String id;
    private IdSalas salaId;
    private LocalDateTime inicio;
    private LocalDateTime fim;

    public Agendamento(String id, IdSalas salaId, LocalDateTime inicio, LocalDateTime fim) {
        this.id = id;
        this.salaId = salaId;
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IdSalas getSalaId() {
        return salaId;
    }

    public void setSalaId(IdSalas salaId) {
        this.salaId = salaId;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }
}
