package com.lead.pizzaria.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ADMINISTRADORES")
public class Administrador extends Usuario{
    public Administrador(String nome, String sobrenome, String email, String fone, String endereco, String login, String senha) {
        super(nome, sobrenome, email, fone, endereco, login, senha);
        System.out.println("Usuário adm criado com sucesso");
    }

    public Administrador() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

