package com.isft151.estudiantes.dtos.responses;

import com.isft151.estudiantes.models.Materia;
import com.isft151.estudiantes.models.Persona;
import lombok.Data;

import java.util.List;

@Data
public class ProfesorResponse {

    private PersonaResponse profesor;
//    private List<MateriaResponse> materias;
}
