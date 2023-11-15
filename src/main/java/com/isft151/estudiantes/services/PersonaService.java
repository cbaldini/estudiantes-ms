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
import java.util.Optional;

@Service
// Clase que contiene la
// lógica para trabajar con el modelo Persona.
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private PersonaMapper personaMapper;

    public ResponseEntity newPersona(PersonaRequest personaRequest) {
        Boolean existePersona = findByDni(personaRequest.getDni()).isEmpty();
        if(existePersona){
            Persona persona = personaRequestToNewPersona(personaRequest);
            savePersona(persona);
            return ResponseEntity.ok("Persona guardada: " + persona.getNombre() + " " + persona.getApellido());
        }
        else {
            return ResponseEntity.badRequest().body("La persona con el DNI especificado ya existe.");
        }
    }

    public ResponseEntity updatePersonaByDni(PersonaRequest personaRequest) {

        try {
            Persona persona = personaRepository.findByDni(personaRequest.getDni()).get(0);
            persona = personaRequestToExistedPersona(persona, personaRequest);
            personaRepository.save(persona);
            return ResponseEntity.ok("Persona actualizada: " + persona.getNombre() + " " + persona.getApellido());
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("No existen personas con el dni: " + personaRequest.getDni());
        }
    }

    public ResponseEntity updatePersona(PersonaRequest personaRequest, Long id) {

        try {
            Persona persona = personaRepository.getById(id);
            persona = personaRequestToExistedPersona(persona, personaRequest);
            personaRepository.save(persona);
            return ResponseEntity.ok("Persona actualizada: " + persona.getNombre() + " " + persona.getApellido());
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("No existen personas con el id: " + id);
        }
    }

    public void savePersona(Persona persona){
        personaRepository.save(persona);
    }

    public Persona personaRequestToNewPersona(PersonaRequest personaRequest) {
        return personaMapper.personaRequestToPersona(new Persona(), personaRequest);
    }

    public Persona personaRequestToExistedPersona(Persona persona, PersonaRequest personaRequest) {
        return personaMapper.personaRequestToPersona(persona, personaRequest);
    }

    public PersonasResponse listarPersonas() {
        List<Persona> listaPersonas = personaRepository.findAll();
        return personaMapper.personaListToResponse(listaPersonas);
    }

    public List<Persona> findByDni(String dni) {
        return personaRepository.findByDni(dni);
    }

    public Optional<Persona> findById(Long id) {

        return personaRepository.findById(id);
    }
    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }
}
