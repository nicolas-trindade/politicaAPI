package com.politica.projeto.repositorio.estudo.service;

import com.politica.projeto.repositorio.estudo.model.implementation.executivo.Presidente;
import com.politica.projeto.repositorio.estudo.repository.implementation.PresidenteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresidenteService {

    private final PresidenteRepository presidenteRepository;


    public PresidenteService(PresidenteRepository presidenteRepository) {
        this.presidenteRepository = presidenteRepository;
    }

    public Presidente salvarPresidente(Presidente presidente){
        return presidenteRepository.save(presidente);
    }

    public List<Presidente> buscarTodosPresidentes(){
        return presidenteRepository.findAll();
    }
}
