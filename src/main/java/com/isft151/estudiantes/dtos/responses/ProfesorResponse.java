package com.isft151.estudiantes.dtos.responses;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class ProfesorResponse {

    private PersonaResponse profesor;
    private List<MateriaResponse> materias;
}
