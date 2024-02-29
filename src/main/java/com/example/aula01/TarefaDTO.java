package com.example.aula01;

import java.time.LocalDateTime;

public class TarefaDTO {
    private String nome;
    private LocalDateTime dateTime;

    public TarefaDTO(String nome, LocalDateTime dateTime) {
        this.nome = nome;
        this.dateTime = dateTime;
    }

    public TarefaDTO(){
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}

