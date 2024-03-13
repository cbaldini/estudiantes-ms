package com.isft151.estudiantes.mappers;

import com.isft151.estudiantes.dtos.requests.EstudianteRequest;
import com.isft151.estudiantes.models.Persona;
import com.isft151.estudiantes.services.MateriaService;
import com.isft151.estudiantes.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteMapper {

    @Autowired
    private MateriaService materiaService;

    @Autowired
    private PersonaService personaService;

    public Persona estudianteRequestToPersona(EstudianteRequest estudianteRequest) {

        Persona persona = Persona.builder()
                .nombre(estudianteRequest.getPersona().getNombre())
                .apellido(estudianteRequest.getPersona().getApellido())
                .dni(estudianteRequest.getPersona().getDni())
                .direccion(estudianteRequest.getPersona().getDireccion())
                .mail(estudianteRequest.getPersona().getMail())
                .telefono(estudianteRequest.getPersona().getTelefono())
                .build();

        return persona;
    }
}
