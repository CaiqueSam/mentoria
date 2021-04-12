package com.lead.pizzaria.entities;

public class Cliente {
    private int cliente_id;
    private String nome;
    private String email;
    private String fone;
    private String endereco;

    public Cliente(int cliente_id, String nome, String email, String fone, String endereco) {
        this.cliente_id = cliente_id;
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.endereco = endereco;
    }

    public Cliente() {

    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cliente_id=" + cliente_id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", fone='" + fone + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
