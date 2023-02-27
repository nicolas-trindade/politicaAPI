package com.politica.projeto.repositorio.estudo.dto.executivo.builder;

import com.politica.projeto.repositorio.estudo.dto.executivo.RegistroExecutivoDTO;
import com.politica.projeto.repositorio.estudo.model.implementation.executivo.Prefeito;
import com.politica.projeto.repositorio.estudo.model.implementation.executivo.Presidente;
import com.politica.projeto.repositorio.estudo.model.reference.Partido;

public class DTOToEntityBuilder {

    public static Presidente buildPresidente(RegistroExecutivoDTO dto, Partido partido) {
        Presidente presidente = new Presidente();
        presidente.setNome(dto.getNome());
        presidente.setCpf(dto.getCpf());
        presidente.setEndereco(dto.getEndereco());
        presidente.setTelefone(dto.getTelefone());
        presidente.setFoto(dto.getFoto());
        presidente.setMandato(dto.getMandato());
        presidente.setPartido(partido);
        return presidente;
    }

    public static Prefeito buildPrefeito(RegistroExecutivoDTO dto, Partido partido) {
        Prefeito prefeito = new Prefeito();
        prefeito.setNome(dto.getNome());
        prefeito.setCpf(dto.getCpf());
        prefeito.setEndereco(dto.getEndereco());
        prefeito.setTelefone(dto.getTelefone());
        prefeito.setFoto(dto.getFoto());
        prefeito.setMandato(dto.getMandato());
        prefeito.setPartido(partido);
        return prefeito;
    }
}
