package com.politica.projeto.repositorio.estudo.dto.executivo;

import com.politica.projeto.repositorio.estudo.model.reference.Partido;

public class RegistroExecutivoDTO {

    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String foto;
    private Boolean mandato;
    private Long partidoId;

    public RegistroExecutivoDTO() {
    }

    public RegistroExecutivoDTO(String nome, String cpf, String endereco, String telefone, String foto, Boolean mandato,
                                Long partidoId) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.foto = foto;
        this.mandato = mandato;
        this.partidoId = partidoId;
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

    public Long getPartidoId() {
        return partidoId;
    }

    public void setPartidoId(Long partidoId) {
        this.partidoId = partidoId;
    }
}
