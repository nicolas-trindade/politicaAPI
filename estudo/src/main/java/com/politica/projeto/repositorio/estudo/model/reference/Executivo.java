package com.politica.projeto.repositorio.estudo.model.reference;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Executivo extends Politico {

    public Executivo() {
    }

    public Executivo(Long id, String nome, String cpf, String endereco, String telefone,
                     String foto, Boolean mandato, Partido partido) {
        super(id, nome, cpf, endereco, telefone, foto, mandato, partido);
    }
}
