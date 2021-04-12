package com.lead.pizzaria.entities;

public class Pedido {
    private int pedido_id;
    private Pizza pizza;
    private Cliente cliente;

    public Pedido(int pedido_id, Pizza pizza, Cliente cliente) {
        this.pedido_id = pedido_id;
        this.pizza = pizza;
        this.cliente = cliente;
    }

    public Pedido() {

    }

    public int getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
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
