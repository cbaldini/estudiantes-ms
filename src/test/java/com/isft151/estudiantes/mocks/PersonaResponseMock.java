package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.dtos.responses.PersonaResponse;

public class PersonaResponseMock {

    public static PersonaResponse mockResponse() {
        PersonaResponse personaResponse = PersonaResponse.builder()
                .nombre("Cristian")
                .apellido("Baldini")
                .direccion("Calle Falsa N° 123")
                .mail("cristianbaldini@abc.gob.ar")
                .dni("33333333")
                .build();

        return personaResponse;
    }
}
