package com.politica.projeto.repositorio.estudo.service;

import com.politica.projeto.repositorio.estudo.model.implementation.executivo.Prefeito;
import com.politica.projeto.repositorio.estudo.repository.reference.ExecutivoRepository;
import org.springframework.stereotype.Service;

@Service
public class PrefeitoService {

    private final ExecutivoRepository executivoRepository;

    public PrefeitoService(ExecutivoRepository executivoRepository) {
        this.executivoRepository = executivoRepository;
    }

    public Prefeito salvarPrefeito(Prefeito prefeito) {
        return executivoRepository.save(prefeito);
    }
}
