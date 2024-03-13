package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.dtos.responses.ProfesorResponse;

public class ProfesorResponseMock {

    public static ProfesorResponse mockResponse() {

        ProfesorResponse profesorResponse = ProfesorResponse.builder()
                .profesor(PersonaResponseMock.mockResponse())
                .materias(MateriaResponseMock.mockList())
                .build();

        return profesorResponse;
    }
}
