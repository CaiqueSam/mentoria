package com.lead.pizzaria.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "TB_CLIENTES")
public class Cliente extends Usuario {

    private List<Pedido> pedidos;

    public Cliente(long usuario_id, String nome, String sobrenome, String email, String fone, String endereco, String login, String senha) {
        super(usuario_id, nome, sobrenome, email, fone, endereco, login, senha);
        System.out.println("Usuário cliente criado com sucesso");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
