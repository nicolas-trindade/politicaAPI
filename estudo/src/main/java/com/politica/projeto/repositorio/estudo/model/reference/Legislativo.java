package com.politica.projeto.repositorio.estudo.model.reference;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Legislativo extends Politico{

    @Column(name="lider",nullable=false,columnDefinition = "boolean default false")
    protected Boolean lider;

    public Legislativo() {
    }

    public Legislativo(Long id, String nome, String cpf, String endereco, String telefone, String foto, Boolean mandato, Partido partido, Boolean lider) {
        super(id, nome, cpf, endereco, telefone, foto, mandato, partido);
        this.lider = lider;
    }

    public Boolean getLider() {
        return lider;
    }

    public void setLider(Boolean lider) {
        this.lider = lider;
    }
}
