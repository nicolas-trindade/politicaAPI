package com.politica.projeto.repositorio.estudo.repository.reference;

import com.politica.projeto.repositorio.estudo.model.reference.Executivo;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutivoRepository extends PoliticoRepository<Executivo, Long> {
}
