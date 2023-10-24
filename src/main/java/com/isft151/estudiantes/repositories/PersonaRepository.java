package com.isft151.estudiantes.repositories;

import com.isft151.estudiantes.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    List<Persona> findByDni(String dni);
}