package br.edu.ifal.gestormotel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartoDAO extends CrudRepository<Quarto, Integer>{

}