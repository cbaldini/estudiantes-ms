package com.isft151.estudiantes.repositories;

import com.isft151.estudiantes.models.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {

    List<Materia> findByNombre(String nombre);
}