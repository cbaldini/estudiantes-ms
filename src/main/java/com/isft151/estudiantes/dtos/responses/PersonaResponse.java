package com.isft151.estudiantes.dtos.responses;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PersonaResponse {
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String mail;
    private String direccion;
}
