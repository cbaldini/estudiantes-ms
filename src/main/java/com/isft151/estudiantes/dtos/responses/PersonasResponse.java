package com.isft151.estudiantes.dtos.responses;

import lombok.Builder;

import java.util.List;

@Builder
public class PersonasResponse {
    private List<PersonaResponse> personas;
}
