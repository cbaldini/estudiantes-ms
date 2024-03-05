package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.models.Carrera;

public class CarreraMock {
    public static Carrera mockEntity(){
        Carrera carrera = new Carrera();
        carrera.setId(1L);
        carrera.setNombre("Técnico Superior en Análisis, Desarrollo y Programación de Aplicaciones");
        return carrera;
    }
}
