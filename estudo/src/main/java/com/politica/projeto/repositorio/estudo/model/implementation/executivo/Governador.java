package com.politica.projeto.repositorio.estudo.model.implementation.executivo;

import com.politica.projeto.repositorio.estudo.model.reference.Executivo;
import com.politica.projeto.repositorio.estudo.model.reference.Partido;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_governador")
public class Governador extends Executivo {

    public Governador() {
    }

    public Governador(Long id, String nome, String cpf, String endereco, String telefone, String foto, Boolean mandato, Partido partido) {
        super(id, nome, cpf, endereco, telefone, foto, mandato, partido);
    }

}
