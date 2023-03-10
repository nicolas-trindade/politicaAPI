package com.politica.projeto.repositorio.estudo.controller;

import com.politica.projeto.repositorio.estudo.dto.executivo.ConsultaExecutivoDTO;
import com.politica.projeto.repositorio.estudo.dto.executivo.ExecutivoMapper;
import com.politica.projeto.repositorio.estudo.dto.executivo.RegistroExecutivoDTO;
import com.politica.projeto.repositorio.estudo.dto.executivo.builder.DTOToEntityBuilder;
import com.politica.projeto.repositorio.estudo.model.implementation.executivo.Prefeito;
import com.politica.projeto.repositorio.estudo.model.reference.Executivo;
import com.politica.projeto.repositorio.estudo.model.reference.Partido;
import com.politica.projeto.repositorio.estudo.service.ExecutivoService;
import com.politica.projeto.repositorio.estudo.service.PartidoService;
//import com.politica.projeto.repositorio.estudo.service.PrefeitoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/prefeito")
public class PrefeitoController {

//    private final PrefeitoService prefeitoService;
    private final ExecutivoService executivoService;

    private final PartidoService partidoService;

    public PrefeitoController(ExecutivoService executivoService, PartidoService partidoService) {
        this.executivoService = executivoService;
        this.partidoService = partidoService;
    }

    /*public PrefeitoController(PrefeitoService prefeitoService, ExecutivoService executivoService,
                              PartidoService partidoService) {
        this.prefeitoService = prefeitoService;
        this.executivoService = executivoService;
        this.partidoService = partidoService;
    }*/




    @PostMapping
    public ResponseEntity<ConsultaExecutivoDTO> salvarPrefeito(@RequestBody RegistroExecutivoDTO dto) {
        Partido partido = partidoService.buscarPartidoPorId(dto.getPartidoId());
        Prefeito prefeitoDTO = DTOToEntityBuilder.buildPrefeito(dto, partido);
        executivoService.salvarExecutivo(prefeitoDTO);
        return ResponseEntity.ok(ExecutivoMapper.fromEntity(prefeitoDTO));
    }

    //TODO Depois de arrumar as classes gen??ricas do repository e service, vai dar pra usar aqui
    /*@GetMapping
    public ResponseEntity<List<ConsultaExecutivoDTO>> buscarPrefeito() {
        return ResponseEntity.ok(executivoService.buscarTodos())
    }*/

    @GetMapping("/listaPrefeitos")
    public ResponseEntity<List<ConsultaExecutivoDTO>> buscarTodos() {
        Prefeito prefeito = new Prefeito();
//        Executivo prefeito = new Prefeito();
        List<Prefeito> prefeitoList = (List<Prefeito>) executivoService.buscarTodosExecutivosPorCargo(prefeito);
        return ResponseEntity.ok(prefeitoList.stream().map(ExecutivoMapper::fromEntity).collect(Collectors.toList()));
        /*return ResponseEntity.ok(executivoService.buscarTodosExecutivosPorCargo(prefeito)
                .stream().map(ExecutivoMapper::fromEntity).collect(Collectors.toList()));*/
    }

}
