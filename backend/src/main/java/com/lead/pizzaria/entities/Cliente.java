package com.lead.pizzaria.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "TB_CLIENTES")
public class Cliente extends Usuario {

    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos = new ArrayList<>();

    public Cliente(String nome, String sobrenome, String email, String fone, String endereco, String login, String senha) {
        super(nome, sobrenome, email, fone, endereco, login, senha);
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public List<Pedido> getPedidos() {return pedidos;}

    public void setPedidos(List<Pedido> pedidos) {this.pedidos = pedidos;}
}
