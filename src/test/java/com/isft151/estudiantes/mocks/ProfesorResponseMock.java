package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.dtos.responses.ProfesorResponse;

public class ProfesorResponseMock {

    public static ProfesorResponse mockResponse() {
        ProfesorResponse profesorResponse = new ProfesorResponse();
        profesorResponse.setProfesor(PersonaResponseMock.mockResponse());
        profesorResponse.setMaterias(MateriaResponseMock.mockList());
        return profesorResponse;
    }
}
