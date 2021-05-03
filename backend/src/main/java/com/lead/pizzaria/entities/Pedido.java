package com.lead.pizzaria.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_PEDIDOS")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pedido_id;
    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Cliente cliente;


    public Pedido(Pizza pizza, Cliente cliente) {
        this.pizza = pizza;
        this.cliente = cliente;
    }

    public Pedido() {
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
