package com.isft151.estudiantes.services;

import com.isft151.estudiantes.dtos.requests.PersonaRequest;
import com.isft151.estudiantes.dtos.responses.PersonasResponse;
import com.isft151.estudiantes.mappers.PersonaMapper;
import com.isft151.estudiantes.models.Persona;
import com.isft151.estudiantes.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// Clase que contiene la
// lógica para trabajar con el modelo Persona.
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private PersonaMapper personaMapper;

    public ResponseEntity setPersona(PersonaRequest personaRequest) {
        Boolean existePersona = findByDni(personaRequest.getDni()).isEmpty();
        if(existePersona){
            Persona persona = personaMapper.personaRequestToPersona(personaRequest);
            personaRepository.save(persona);
            return ResponseEntity.ok("Persona guardada: " + persona.getNombre() + " " + persona.getApellido());
        }
        else {
            return ResponseEntity.badRequest().body("La persona con el DNI especificado ya existe.");
        }
    }

    public PersonasResponse listarPersonas() {
        List<Persona> listaPersonas = personaRepository.findAll();
        return personaMapper.personaListToResponse(listaPersonas);
    }

    public List<Persona> findByDni(String dni) {
        return personaRepository.findByDni(dni);
    }

    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }
}
