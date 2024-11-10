package ar.edu.ies6.tp07.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.ies6.tp07.model.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia,String>{

}
