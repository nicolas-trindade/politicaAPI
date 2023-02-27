package com.politica.projeto.repositorio.estudo.dto;

public class PartidoDTO {

    private Long id;
    private Integer numero;
    private String nome;
    private String sigla;

    public PartidoDTO() {
    }

    public PartidoDTO(Long id, Integer numero, String nome, String sigla) {
        this.id = id;
        this.numero = numero;
        this.nome = nome;
        this.sigla = sigla;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "PartidoDTO{" +
                "id=" + id +
                ", numero=" + numero +
                ", nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}
