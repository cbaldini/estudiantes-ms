package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.models.Profesor;

public class ProfesorMock {

    public static Profesor mockEntity(){
        Profesor profesor = new Profesor();
        profesor.setId(1L);
        profesor.setPersona(PersonaMock.mockEntity());
        profesor.setMaterias(MateriaMock.mockList());
        return profesor;
    }
}
