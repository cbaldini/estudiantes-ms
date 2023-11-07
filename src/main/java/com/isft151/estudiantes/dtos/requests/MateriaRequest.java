package com.isft151.estudiantes.dtos.requests;

import lombok.Data;

@Data
public class MateriaRequest {

    private String nombre;
    private Integer anio;
    private CarreraRequest carrera;
}
