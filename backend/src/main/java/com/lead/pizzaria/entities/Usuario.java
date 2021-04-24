package com.lead.pizzaria.entities;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long usuario_id;
    @Column(length = 15, nullable = false)
    private String nome;
    @Column(length = 15, nullable = false)
    private String sobrenome;
    @Column(length = 100, nullable = false)
    private String email;
    @Column(length = 15, nullable = false)
    private String fone;
    @Column(length = 100, nullable = false)
    private String endereco;
    @Column(length = 15, nullable = false)
    private String login;
    @Column(length = 15, nullable = false)
    private String senha;

    public Usuario() {
    }

    public Usuario(String nome, String sobrenome, String email, String fone, String endereco, String login, String senha) {
        this.usuario_id = usuario_id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.fone = fone;
        this.endereco = endereco;
        this.login = login;
        this.senha = senha;
    }

    public long getUsuario_id() {
        return usuario_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuario_id=" + usuario_id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", fone='" + fone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
