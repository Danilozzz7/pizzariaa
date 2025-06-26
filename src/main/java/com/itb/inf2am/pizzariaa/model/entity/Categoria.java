package com.itb.inf2am.pizzariaa.model.entity;

public class Categoria {
    private long id;
    private String nome;
    private String descricao;
    private boolean codstatus;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isCodstatus() {
        return codstatus;
    }
}
