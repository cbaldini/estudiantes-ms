package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.models.Persona;

public class PersonaMock {

    public static Persona mockEntity() {
        Persona persona = Persona.builder()
                .id(1L)
                .nombre("Cristian")
                .apellido("Baldini")
                .direccion("Calle Falsa N° 123")
                .telefono("2222222222")
                .dni("33333333")
                .mail("cristianbaldini@abc.gob.ar")
                .build();

        return persona;
    }
}
