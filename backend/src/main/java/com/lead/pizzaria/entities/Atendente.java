package com.lead.pizzaria.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ATENDENTES")
public class Atendente extends Usuario{
    public Atendente(long usuario_id, String nome, String sobrenome, String email, String fone, String endereco, String login, String senha) {
        super(usuario_id, nome, sobrenome, email, fone, endereco, login, senha);
        System.out.println("Usuário atendente criado com sucesso");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
