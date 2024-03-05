package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.dtos.requests.ProfesorRequest;

public class ProfesorRequestMock {

    public static ProfesorRequest mockRequest() {
        ProfesorRequest profesorRequest = new ProfesorRequest();
        profesorRequest.setPersona(PersonaRequestMock.mockRequest());
        profesorRequest.setMaterias(MateriaRequestMock.mockList());
        return profesorRequest;
    }
}
