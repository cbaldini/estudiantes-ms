package com.isft151.estudiantes.repositories;

import com.isft151.estudiantes.models.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamenRepository extends JpaRepository<Examen, Long> {
}
