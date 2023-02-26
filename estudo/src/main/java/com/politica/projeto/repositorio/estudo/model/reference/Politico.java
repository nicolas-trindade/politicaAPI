package com.politica.projeto.repositorio.estudo.model.reference;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Politico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",unique=true,nullable=false)
    protected Long id;
    @Column(name="nome",nullable=false)
    protected String nome;
    @Column(name="cpf",nullable=false)
    protected String cpf;
    @Column(name="endereco",nullable=false)
    protected String endereco;
    @Column(name="telefone",nullable=false)
    protected String telefone;
    @Column(name="foto",nullable=false)
    protected String foto;
    @Column(name="mandato",nullable=false)
    protected Boolean mandato;
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_partido")
    protected Partido partido;

    public Politico() {
    }

    public Politico(Long id, String nome, String cpf, String endereco, String telefone, String foto, Boolean mandato, Partido partido) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.foto = foto;
        this.mandato = mandato;
        this.partido = partido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Boolean getMandato() {
        return mandato;
    }

    public void setMandato(Boolean mandato) {
        this.mandato = mandato;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
}
