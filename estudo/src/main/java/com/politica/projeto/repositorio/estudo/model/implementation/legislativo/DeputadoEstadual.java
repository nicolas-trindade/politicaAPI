package com.politica.projeto.repositorio.estudo.model.implementation.legislativo;

import com.politica.projeto.repositorio.estudo.model.reference.Legislativo;
import com.politica.projeto.repositorio.estudo.model.reference.Partido;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_deputado_estadual")
public class DeputadoEstadual extends Legislativo {

    public DeputadoEstadual() {
    }

    public DeputadoEstadual(Long id, String nome, String cpf, String endereco, String telefone, String foto, Boolean mandato, Partido partido, Boolean lider) {
        super(id, nome, cpf, endereco, telefone, foto, mandato, partido, lider);
    }
}
