package com.isft151.estudiantes.mappers;

import com.isft151.estudiantes.dtos.PersonaRequest;
import com.isft151.estudiantes.dtos.PersonaResponse;
import com.isft151.estudiantes.dtos.PersonasResponse;
import com.isft151.estudiantes.models.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaMapper {
    public Persona personaRequestToPersona(PersonaRequest personaRequest){

        Persona persona = new Persona();
        persona.setNombre(personaRequest.getNombre());
        persona.setApellido(personaRequest.getApellido());
        persona.setDni(personaRequest.getDni());
        persona.setDireccion(personaRequest.getDireccion());
        persona.setMail(personaRequest.getMail());
        persona.setTelefono(personaRequest.getTelefono());

        return persona;
    }

    public PersonasResponse personaListToResponse(List<Persona> personas) {
        List<PersonaResponse> personaResponseList = new ArrayList<>();

        for (Persona persona : personas) {
            PersonaResponse personaResponse = new PersonaResponse();
            personaResponse.setApellido(persona.getApellido());
            personaResponse.setNombre(persona.getNombre());
            personaResponse.setDireccion(persona.getDireccion());
            personaResponse.setTelefono(persona.getTelefono());
            personaResponse.setMail(persona.getMail());
            personaResponse.setDni(persona.getDni());
            personaResponseList.add(personaResponse);
        }
        PersonasResponse personasResponse = new PersonasResponse();
        personasResponse.setPersonas(personaResponseList);
        return personasResponse;
    }
}
