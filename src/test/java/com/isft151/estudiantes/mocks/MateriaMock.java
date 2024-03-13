package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.models.Materia;

import java.util.ArrayList;
import java.util.List;

public class MateriaMock {

    public static Materia mockEntity() {

        Materia materia = Materia.builder()
                .id(1L)
                .nombre("Seminario de Programación")
                .anio(2)
                .carrera(CarreraMock.mockEntity())
                .build();

        return materia;
    }

    public static List<Materia> mockList() {
        List<Materia> materias = new ArrayList<>();
        materias.add(mockEntity());
        return materias;
    }
}
