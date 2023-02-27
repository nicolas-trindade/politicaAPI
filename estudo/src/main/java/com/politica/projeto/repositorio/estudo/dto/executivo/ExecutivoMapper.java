package com.politica.projeto.repositorio.estudo.dto.executivo;

import com.politica.projeto.repositorio.estudo.model.reference.Executivo;
import com.politica.projeto.repositorio.estudo.model.reference.Partido;
import com.politica.projeto.repositorio.estudo.service.PartidoService;

public class ExecutivoMapper {

    public final PartidoService partidoService;

    public ExecutivoMapper(PartidoService partidoService) {
        this.partidoService = partidoService;
    }

    public Partido findPartido(Long id){
        return partidoService.buscarPartidoPorId(id);
    }

    public static Executivo fromDTO(RegistroExecutivoDTO dto) {

        Partido partido = new Partido();
        partido.setId(dto.getPartidoId());

        return new Executivo(null, dto.getNome(), dto.getCpf(), dto.getEndereco(), dto.getTelefone(), dto.getFoto(),
                dto.getMandato(), partido);
    }

    public static ConsultaExecutivoDTO fromEntity(Executivo executivo) {
        return new ConsultaExecutivoDTO(executivo.getId(), executivo.getNome(), executivo.getCpf(), executivo.getEndereco(),
                executivo.getTelefone(), executivo.getFoto(), executivo.getMandato(), executivo.getPartido());
    }
}
