package com.isft151.estudiantes.dtos;

import lombok.Data;

import java.util.List;

@Data
public class PersonasResponse {
    private List<PersonaResponse> personas;
}
