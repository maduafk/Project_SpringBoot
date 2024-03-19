package com.projetoum.projetoum.entity;



public class Pessoa extends SerVivo {

    private Long id;

    private String nome;

    public Pessoa(Long id, String nome, String sangue) {
        super(sangue);
        this.id = id;
        this.nome = nome;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
