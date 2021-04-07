package com.lead.pizzaria.entities;

public class Pizza {
    private int pizza_id;
    private String sabor;
    private char tamanho;
    private boolean extrabacon;
    private boolean sem_cebola;
    private boolean borda_recheada;

    public Pizza() {

    }

    public Pizza(int pizza_id, String sabor, char tamanho, boolean extrabacon, boolean sem_cebola, boolean borda_recheada) {
        this.pizza_id = pizza_id;
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.extrabacon = extrabacon;
        this.sem_cebola = sem_cebola;
        this.borda_recheada = borda_recheada;
    }

    public int getPizza_id() {
        return pizza_id;
    }

    public void setPizza_id(int pizza_id) {
        this.pizza_id = pizza_id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isExtrabacon() {
        return extrabacon;
    }

    public void setExtrabacon(boolean extrabacon) {
        this.extrabacon = extrabacon;
    }

    public boolean isSem_cebola() {
        return sem_cebola;
    }

    public void setSem_cebola(boolean sem_cebola) {
        this.sem_cebola = sem_cebola;
    }

    public boolean isBorda_recheada() {
        return borda_recheada;
    }

    public void setBorda_recheada(boolean borda_recheada) {
        this.borda_recheada = borda_recheada;
    }
}