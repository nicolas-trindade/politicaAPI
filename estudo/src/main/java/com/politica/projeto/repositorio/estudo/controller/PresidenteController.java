package com.politica.projeto.repositorio.estudo.controller;

import com.politica.projeto.repositorio.estudo.dto.executivo.ConsultaExecutivoDTO;
import com.politica.projeto.repositorio.estudo.dto.executivo.ExecutivoMapper;
import com.politica.projeto.repositorio.estudo.dto.executivo.RegistroExecutivoDTO;
import com.politica.projeto.repositorio.estudo.dto.executivo.builder.DTOToEntityBuilder;
import com.politica.projeto.repositorio.estudo.model.implementation.executivo.Presidente;
import com.politica.projeto.repositorio.estudo.model.reference.Partido;
import com.politica.projeto.repositorio.estudo.service.PartidoService;
import com.politica.projeto.repositorio.estudo.service.PresidenteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/presidente")
public class PresidenteController {

    private final PresidenteService presidenteService;
    private final PartidoService partidoService;

    public PresidenteController(PresidenteService presidenteService, PartidoService partidoService) {
        this.presidenteService = presidenteService;
        this.partidoService = partidoService;
    }

    @PostMapping
    public ResponseEntity<ConsultaExecutivoDTO> salvarPresidente(@RequestBody RegistroExecutivoDTO dto) {
        Partido partido = partidoService.buscarPartidoPorId(dto.getPartidoId());
        Presidente presidenteDTO = DTOToEntityBuilder.buildPresidente(dto, partido);
        presidenteService.salvarPresidente(presidenteDTO);
        return ResponseEntity.ok(ExecutivoMapper.fromEntity(presidenteDTO));
    }

    @GetMapping
    public ResponseEntity<List<ConsultaExecutivoDTO>> buscarPresidente() {
        return ResponseEntity.ok(presidenteService.buscarTodosPresidentes()
                .stream().map(ExecutivoMapper::fromEntity).collect(Collectors.toList()));
    }
}
