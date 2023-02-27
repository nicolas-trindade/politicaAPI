package com.politica.projeto.repositorio.estudo.repository.reference;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface PoliticoRepository<T, ID> extends JpaRepository<T, ID> {
    // TODO Dar uma olhada nesse repository principalmente nos findAll
    Optional<T> findById(ID id);

    List<T> findAll();

    <S extends T> List<S> findAll(Example<S> example);

    <S extends T> S save(S entity);
}
