package com.isft151.estudiantes.dtos.responses;

import com.isft151.estudiantes.models.Profesor;
import lombok.Data;

import java.util.List;

@Data
public class ProfesoresResponse {

    private List<Profesor> profesores;
}
