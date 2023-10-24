package com.isft151.estudiantes.mappers;

import com.isft151.estudiantes.dtos.EstudianteRequest;
import com.isft151.estudiantes.dtos.MateriaRequest;
import com.isft151.estudiantes.dtos.ProfesorRequest;
import com.isft151.estudiantes.models.Estudiante;
import com.isft151.estudiantes.models.Materia;
import com.isft151.estudiantes.models.Persona;
import com.isft151.estudiantes.models.Profesor;
import com.isft151.estudiantes.services.EstudianteService;
import com.isft151.estudiantes.services.MateriaService;
import com.isft151.estudiantes.services.PersonaService;
import com.isft151.estudiantes.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteMapper {

    @Autowired
    private MateriaService materiaService;

    @Autowired
    private PersonaService personaService;

    public Persona estudianteRequestToPersona(EstudianteRequest estudianteRequest) {

        Persona persona = new Persona();
        persona.setNombre(estudianteRequest.getPersona().getNombre());
        persona.setApellido(estudianteRequest.getPersona().getApellido());
        persona.setDni(estudianteRequest.getPersona().getDni());
        persona.setDireccion(estudianteRequest.getPersona().getDireccion());
        persona.setTelefono(estudianteRequest.getPersona().getTelefono());
        persona.setMail(estudianteRequest.getPersona().getMail());
        return persona;
    }
}
