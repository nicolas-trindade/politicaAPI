package com.politica.projeto.repositorio.estudo.repository.reference;

import com.politica.projeto.repositorio.estudo.model.reference.Executivo;
import com.politica.projeto.repositorio.estudo.model.reference.Politico;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExecutivoRepository extends PoliticoRepository<Executivo, Long> {

    public List<Executivo> findAll();
    <Executivo extends Politico> List<Executivo> findAllExecutivo(Executivo executivo);

}
