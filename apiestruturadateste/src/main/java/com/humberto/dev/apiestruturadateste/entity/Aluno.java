package com.humberto.dev.apiestruturadateste.entity;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Aluno {

    @jakarta.persistence.Id
    private int id;
    private String nome;
    private String trilha;

    public Aluno(int id, String nome, String trilha) {
        this.id = id;
        this.nome = nome;
        this.trilha = trilha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTrilha() {
        return trilha;
    }

    public void setTrilha(String trilha) {
        this.trilha = trilha;
    }
}
