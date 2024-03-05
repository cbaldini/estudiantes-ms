package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.dtos.requests.PersonaRequest;

public class PersonaRequestMock {

    public static PersonaRequest mockRequest() {
        PersonaRequest personaRequest = new PersonaRequest();
        personaRequest.setNombre("Cristian");
        personaRequest.setApellido("Baldini");
        personaRequest.setDireccion("Calle Falsa N° 123");
        personaRequest.setMail("cristianbaldini@abc.gob.ar");
        personaRequest.setDni("33333333");
        return personaRequest;
    }
}
