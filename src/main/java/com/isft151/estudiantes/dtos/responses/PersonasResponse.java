package com.isft151.estudiantes.dtos.responses;

import com.isft151.estudiantes.dtos.responses.PersonaResponse;
import lombok.Data;

import java.util.List;

@Data
public class PersonasResponse {
    private List<PersonaResponse> personas;
}
