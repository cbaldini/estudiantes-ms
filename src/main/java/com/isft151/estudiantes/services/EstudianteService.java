package com.isft151.estudiantes.services;

import com.isft151.estudiantes.dtos.EstudianteRequest;
import com.isft151.estudiantes.mappers.EstudianteMapper;
import com.isft151.estudiantes.models.Estudiante;
import com.isft151.estudiantes.models.Persona;
import com.isft151.estudiantes.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private EstudianteMapper estudianteMapper;

    @Autowired
    private PersonaService personaService;

    public ResponseEntity setEstudiante(EstudianteRequest estudianteRequest) throws SQLException {

        Estudiante estudiante = new Estudiante();
        setPersonaNuevaOExistente(estudianteRequest, estudiante);

        try {
            estudianteRepository.save(estudiante);
        }
        catch (RuntimeException exception) {
            return ResponseEntity.badRequest().body(exception.getCause().getLocalizedMessage());
        }
        return ResponseEntity.ok("Estudiante guardado: " + estudiante.getPersona().getNombre() + " "
                + estudiante.getPersona().getApellido());
    }
    
    public void setPersonaNuevaOExistente(EstudianteRequest estudianteRequest, Estudiante estudiante) {
        if(personaService.getByDni(estudianteRequest.getPersona().getDni()).isEmpty()) {
            Persona persona = estudianteMapper.estudianteRequestToPersona(estudianteRequest);
            estudiante.setPersona(persona);
            personaService.save(persona);
        }
        else {
            estudiante.setPersona(personaService.getByDni(estudianteRequest.getPersona().getDni()).get(0));
        }
    }
}
