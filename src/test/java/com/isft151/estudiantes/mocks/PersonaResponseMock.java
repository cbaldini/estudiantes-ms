package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.dtos.responses.PersonaResponse;

public class PersonaResponseMock {

    public static PersonaResponse mockResponse() {
        PersonaResponse personaResponse = new PersonaResponse();
        personaResponse.setNombre("Cristian");
        personaResponse.setApellido("Baldini");
        personaResponse.setDireccion("Calle Falsa N° 123");
        personaResponse.setMail("cristianbaldini@abc.gob.ar");
        personaResponse.setDni("33333333");
        return personaResponse;
    }
}
