package com.isft151.estudiantes.dtos.requests;

import com.isft151.estudiantes.models.Persona;
import lombok.Data;

@Data
public class EstudianteRequest {

    private Persona persona;
    private String legajo;
}
