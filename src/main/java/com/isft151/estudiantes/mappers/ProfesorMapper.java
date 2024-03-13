package com.isft151.estudiantes.mappers;

import com.isft151.estudiantes.dtos.requests.MateriaRequest;
import com.isft151.estudiantes.dtos.requests.ProfesorRequest;
import com.isft151.estudiantes.dtos.responses.PersonaResponse;
import com.isft151.estudiantes.dtos.responses.ProfesorResponse;
import com.isft151.estudiantes.models.Materia;
import com.isft151.estudiantes.models.Persona;
import com.isft151.estudiantes.models.Profesor;
import com.isft151.estudiantes.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfesorMapper {

    @Autowired
    private MateriaService materiaService;

    public Profesor profesorRequestToProfesor(ProfesorRequest profesorRequest, Profesor profesor){


        List<Materia> materiaList = new ArrayList<>();
        for (MateriaRequest materiaRequest : profesorRequest.getMaterias()) {

                Materia materia = Materia.builder()
                        .nombre(materiaRequest.getNombre())
                        .anio(materiaRequest.getAnio())
                        .build();

            materia = materiaService.setMateriaNuevaOExistente(materiaRequest, materia);
            materiaList.add(materia);
            }

        profesor.setMaterias(materiaList);
        return profesor;
    }



    public Persona profesorRequestToPersona(ProfesorRequest profesorRequest) {

        Persona persona = Persona.builder()
                .nombre(profesorRequest.getPersona().getNombre())
                .apellido(profesorRequest.getPersona().getApellido())
                .dni(profesorRequest.getPersona().getDni())
                .direccion(profesorRequest.getPersona().getDireccion())
                .telefono(profesorRequest.getPersona().getTelefono())
                .mail(profesorRequest.getPersona().getMail())
                .build();

        return persona;
    }

    public ProfesorResponse personaToProfesor (Persona persona, List<Materia> materias) {
        PersonaResponse profesor = PersonaResponse.builder()
                .apellido(persona.getApellido())
                .nombre(persona.getNombre())
                .mail(persona.getMail())
                .dni(persona.getDni())
                .direccion(persona.getDireccion())
                .telefono(persona.getTelefono())
                .build();

        ProfesorResponse profesorResponse = ProfesorResponse.builder()
                .profesor(profesor)
                .build();

//        profesorResponse.setMaterias();
        return null;
    }
}
