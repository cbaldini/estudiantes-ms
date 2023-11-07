package com.isft151.estudiantes.services;

import com.isft151.estudiantes.dtos.requests.ProfesorRequest;
import com.isft151.estudiantes.mappers.ProfesorMapper;
import com.isft151.estudiantes.models.Persona;
import com.isft151.estudiantes.models.Profesor;
import com.isft151.estudiantes.repositories.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private ProfesorMapper profesorMapper;

    @Autowired
    private PersonaService personaService;

    public ResponseEntity setProfesor(ProfesorRequest profesorRequest) throws SQLException {
        Profesor profesor = new Profesor();
        setPersonaNuevaOExistente(profesorRequest, profesor);
        profesor = profesorMapper.profesorRequestToProfesor(profesorRequest, profesor);

        try {
        profesorRepository.save(profesor);
        }
        catch (RuntimeException exception) {
            return ResponseEntity.badRequest().body(exception.getCause().getLocalizedMessage());
        }
        return ResponseEntity.ok("Profesor guardado: " + profesor.getPersona().getNombre() + " "
                + profesor.getPersona().getApellido());
    }

    // Toma los datos de la persona de ProfesorRequest, verifica si existe la persona. Si no es así la crea
    // y si existe, toma esos datos y los asigna a profesor.
    public void setPersonaNuevaOExistente(ProfesorRequest profesorRequest, Profesor profesor) {
        if(personaService.findByDni(profesorRequest.getPersona().getDni()).isEmpty()) {
            Persona persona = profesorMapper.profesorRequestToPersona(profesorRequest);
            profesor.setPersona(persona);
            personaService.save(persona);
        }
        else {
            profesor.setPersona(personaService.findByDni(profesorRequest.getPersona().getDni()).get(0));
        }
    }

    public void deleteProfesor(Long id) {
        profesorRepository.deleteById(id);
    }
}
