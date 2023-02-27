package com.politica.projeto.repositorio.estudo.repository.implementation;

import com.politica.projeto.repositorio.estudo.model.implementation.executivo.Presidente;
import com.politica.projeto.repositorio.estudo.repository.reference.PoliticoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresidenteRepository extends PoliticoRepository<Presidente, Long> {
}
