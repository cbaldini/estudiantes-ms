package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.dtos.requests.PersonaRequest;
import com.isft151.estudiantes.models.Persona;

public class PersonaMock {

    public static Persona mockEntity() {
        Persona persona = new Persona();
        persona.setId(1L);
        persona.setNombre("Cristian");
        persona.setApellido("Baldini");
        persona.setDireccion("Calle Falsa N° 123");
        persona.setMail("cristianbaldini@abc.gob.ar");
        persona.setDni("33333333");
        return persona;
    }
}
