package br.com.examplo.api.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.examplo.api.modelo.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa,Integer> {
    

    List<Pessoa>findAll();
    
} 