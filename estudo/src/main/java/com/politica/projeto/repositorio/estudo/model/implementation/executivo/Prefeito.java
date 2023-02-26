package com.politica.projeto.repositorio.estudo.model.implementation.executivo;

import com.politica.projeto.repositorio.estudo.model.reference.Executivo;
import com.politica.projeto.repositorio.estudo.model.reference.Partido;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_prefeito")
public class Prefeito extends Executivo {

    public Prefeito() {
    }

    public Prefeito(Long id, String nome, String cpf, String endereco, String telefone, String foto, Boolean mandato, Partido partido) {
        super(id, nome, cpf, endereco, telefone, foto, mandato, partido);
    }
}
