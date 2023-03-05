package com.politica.projeto.repositorio.estudo.repository.reference;

import com.politica.projeto.repositorio.estudo.model.reference.Executivo;
import com.politica.projeto.repositorio.estudo.model.reference.Legislativo;
import com.politica.projeto.repositorio.estudo.model.reference.Politico;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface PoliticoRepository<T, ID> extends JpaRepository<T, ID> {
    // TODO Dar uma olhada nesse repository principalmente nos findAllExecutivo
    Optional<T> findById(ID id);

//    List<T> findAllExecutivo();

//    List<Politico> findAllExecutivo(Politico politico);

    <S extends T> List<S> findAll(Executivo executivo);

    <S extends T> List<S> findAllExecutivo(Executivo executivo);
    <S extends T> List<S> findAll(Legislativo legislativo);

    <S extends T> S save(S entity);
}
