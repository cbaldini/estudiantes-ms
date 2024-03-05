package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.models.Materia;

import java.util.ArrayList;
import java.util.List;

public class MateriaMock {

    public static Materia mockEntity() {
        Materia materia = new Materia();
        materia.setId(1L);
        materia.setNombre("Seminario de Programación");
        materia.setAnio(2);
        materia.setCarrera(CarreraMock.mockEntity());
        return materia;
    }

    public static List<Materia> mockList() {
        List<Materia> materias = new ArrayList<>();
        materias.add(mockEntity());
        return materias;
    }
}
