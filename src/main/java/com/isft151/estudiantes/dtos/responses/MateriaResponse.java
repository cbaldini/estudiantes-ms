package com.isft151.estudiantes.dtos.responses;

import com.isft151.estudiantes.dtos.requests.CarreraResponse;
import lombok.Data;

@Data
public class MateriaResponse {

    private String nombre;
    private Integer anio;
    private CarreraResponse carrera;
}
