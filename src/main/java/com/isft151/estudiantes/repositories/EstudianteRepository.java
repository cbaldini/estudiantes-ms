package com.isft151.estudiantes.repositories;

import com.isft151.estudiantes.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
