package com.politica.projeto.repositorio.estudo.service;

import com.politica.projeto.repositorio.estudo.model.reference.Partido;
import com.politica.projeto.repositorio.estudo.repository.reference.PartidoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PartidoService {

    private final PartidoRepository partidoRepository;

    public PartidoService(PartidoRepository partidoRepository) {
        this.partidoRepository = partidoRepository;
    }

    public Partido salvarPartido(Partido partido){
        return partidoRepository.save(partido);
    }

    public Partido buscarPartidoPorId(Long id){
        Optional<Partido> partido = partidoRepository.findById(id);
        return partido.get();
    }
}
