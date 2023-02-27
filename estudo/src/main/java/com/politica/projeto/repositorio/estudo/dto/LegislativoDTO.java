package com.politica.projeto.repositorio.estudo.dto;

import com.politica.projeto.repositorio.estudo.model.reference.Partido;

public class LegislativoDTO {

    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String foto;
    private Boolean mandato;
    private Partido partido;
    private Boolean lider;

    public LegislativoDTO() {
    }

    public LegislativoDTO(Long id, String nome, String cpf, String endereco, String telefone, String foto,
                          Boolean mandato,
                          Partido partido, Boolean lider) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.foto = foto;
        this.mandato = mandato;
        this.partido = partido;
        this.lider = lider;
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

    public Boolean getLider() {
        return lider;
    }

    public void setLider(Boolean lider) {
        this.lider = lider;
    }

    @Override
    public String toString() {
        return "LegislativoDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", foto='" + foto + '\'' +
                ", mandato=" + mandato +
                ", partido=" + partido +
                ", lider=" + lider +
                '}';
    }
}
