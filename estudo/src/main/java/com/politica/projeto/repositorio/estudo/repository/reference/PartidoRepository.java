package com.politica.projeto.repositorio.estudo.repository.reference;

import com.politica.projeto.repositorio.estudo.model.reference.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidoRepository extends JpaRepository<Partido, Long> {
}
