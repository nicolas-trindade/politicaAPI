package com.politica.projeto.repositorio.estudo.model.implementation.executivo;

import com.politica.projeto.repositorio.estudo.model.reference.Executivo;
import com.politica.projeto.repositorio.estudo.model.reference.Partido;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_presidente")
public class Presidente extends Executivo {

    public Presidente() {
    }

    public Presidente(Long id, String nome, String cpf, String endereco, String telefone, String foto, Boolean mandato, Partido partido) {
        super(id, nome, cpf, endereco, telefone, foto, mandato, partido);
    }
}
