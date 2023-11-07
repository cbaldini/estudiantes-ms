package com.isft151.estudiantes.repositories;

import com.isft151.estudiantes.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Interface para hacer consultas (create, read, update, delete)
// A la base de datos.
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    List<Persona> findByDni(String dni);
}