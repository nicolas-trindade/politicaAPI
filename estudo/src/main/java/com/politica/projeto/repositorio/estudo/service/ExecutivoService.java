package com.politica.projeto.repositorio.estudo.service;

import com.politica.projeto.repositorio.estudo.model.reference.Executivo;
import com.politica.projeto.repositorio.estudo.repository.reference.ExecutivoRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExecutivoService {

    private final ExecutivoRepository executivoRepository;

    public ExecutivoService(ExecutivoRepository executivoRepository) {
        this.executivoRepository = executivoRepository;
    }

    public Executivo salvarExecutivo(Executivo executivo){
        return executivoRepository.save(executivo);
    }
    //TODO quando arrumar o repository generico, da pra usar aqui o service.
    //TODO procurar saber como declarar uma entidade genérica
    /*public List<Executivo> buscarTodos(Example<?> example){
        executivoRepository.findAll();
    }*/
}
