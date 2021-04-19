package com.lead.pizzaria.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "TB_PIZZAS")
public class Pizza implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pizza_id;
    @Column(nullable = false)
    private String sabor;
    @Column(nullable = false)
    private char tamanho;

    private boolean extrabacon;

    private boolean sem_cebola;

    private boolean borda_recheada;

    private float preco;

    private int duracaoPreparo;

    public Pizza(long pizza_id, String sabor, char tamanho) {
        this.pizza_id = pizza_id;
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.extrabacon = false;
        this.sem_cebola = false;
        this.borda_recheada = false;
        this.preco = definirPreco(this.tamanho, this.extrabacon, this.sem_cebola, this.borda_recheada);
        this.duracaoPreparo = definirDuracao(this.tamanho, this.sabor, this.extrabacon, this.sem_cebola, this.borda_recheada);
    }

    public Pizza(long pizza_id, String sabor, char tamanho, boolean extrabacon, boolean sem_cebola, boolean borda_recheada) {
        this.pizza_id = pizza_id;
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.extrabacon = extrabacon;
        this.sem_cebola = sem_cebola;
        this.borda_recheada = borda_recheada;
        this.preco = definirPreco(this.tamanho, this.extrabacon, this.sem_cebola, this.borda_recheada);
        this.duracaoPreparo = definirDuracao(this.tamanho, this.sabor, this.extrabacon, this.sem_cebola, this.borda_recheada);

    }

    public long getPizza_id() {
        return pizza_id;
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getDuracaoPreparo() {
        return duracaoPreparo;
    }

    public void setDuracaoPreparo(int duracaoPreparo) {
        this.duracaoPreparo = duracaoPreparo;
    }

    public float definirPreco(char tamanho, boolean extrabacon, boolean sem_cebola, boolean borda_recheada){
        if (tamanho == 'P') {
            this.preco += 20;
        } else if (tamanho == 'M') {
            this.preco += 30;
        } else if (tamanho == 'G') {
            this.preco += 40;
        }

        if (extrabacon) {
            this.preco += 3;
        }if (borda_recheada){
            this.preco += 5;
        }
        return this.preco;
    }
    public int definirDuracao(char Tamanho, String sabor, boolean extrabacon, boolean sem_cebola, boolean borda_recheada){
        if (tamanho == 'P') {
            this.duracaoPreparo += 15;
        } else if (tamanho == 'M') {
            this.duracaoPreparo += 20;
        } else if (tamanho == 'G') {
            this.duracaoPreparo += 25;
        }

        if (sabor == "Portuguesa"){
            this.duracaoPreparo += 5;
        }

        if (borda_recheada){
            this.duracaoPreparo += 5;
        }
        return this.duracaoPreparo;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizza_id=" + getPizza_id() +
                ", sabor='" + getSabor() + '\'' +
                ", tamanho=" + getTamanho() +
                ", extrabacon=" + isExtrabacon() +
                ", sem_cebola=" + isSem_cebola() +
                ", borda_recheada=" + isBorda_recheada() +
                ", preco=" + "R$" + getPreco() +
                ", duracaoPreparo=" + getDuracaoPreparo() + " Minutos" +
                '}';
    }
}
