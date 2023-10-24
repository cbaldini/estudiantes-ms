package com.isft151.estudiantes.dtos;

import lombok.Data;

import java.util.List;

@Data
public class ProfesorRequest {
    private PersonaRequest persona;
    private List<MateriaRequest> materias;
}
