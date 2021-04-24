package com.lead.pizzaria.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "TB_PEDIDOS")
public class Pedido implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pedido_id;
    @Column(nullable = false)
    private Pizza pizza;
    @Column(nullable = false)
    private Cliente cliente;

    public Pedido(long pedido_id, Pizza pizza, Cliente cliente) {
        this.pedido_id = pedido_id;
        this.pizza = pizza;
        this.cliente = cliente;
    }

    public Pedido() {
    }

    public void setPedido_id(long pedido_id) {
        this.pedido_id = pedido_id;
    }

    public long getPedido_id() {
        return pedido_id;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String status(){
        return "Pedido{" +
                "Pedido_id=" + pedido_id +
                ", Cliente='" + cliente.getNome() + '\'' +
                ", Pizza='" + pizza.getSabor() + " - " + pizza.getTamanho() + '\'' +
                ", Valor='" + pizza.getPreco() + " Reais" + '\'' +
                ", Tempo de preparo='" + pizza.getDuracaoPreparo() + " minutos" + '\'' +
                '}';
    }
}
