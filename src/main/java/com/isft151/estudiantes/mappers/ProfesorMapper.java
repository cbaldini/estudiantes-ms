package com.isft151.estudiantes.mappers;

import com.isft151.estudiantes.dtos.requests.MateriaRequest;
import com.isft151.estudiantes.dtos.requests.ProfesorRequest;
import com.isft151.estudiantes.dtos.responses.PersonaResponse;
import com.isft151.estudiantes.dtos.responses.PersonasResponse;
import com.isft151.estudiantes.dtos.responses.ProfesorResponse;
import com.isft151.estudiantes.dtos.responses.ProfesoresResponse;
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

                Materia materia = new Materia();
                materia.setNombre(materiaRequest.getNombre());
                materia.setAnio(materiaRequest.getAnio());
            materia = materiaService.setMateriaNuevaOExistente(materiaRequest, materia);
            materiaList.add(materia);
            }

        profesor.setMaterias(materiaList);
        return profesor;
    }



    public Persona profesorRequestToPersona(ProfesorRequest profesorRequest) {

        Persona persona = new Persona();
        persona.setNombre(profesorRequest.getPersona().getNombre());
        persona.setApellido(profesorRequest.getPersona().getApellido());
        persona.setDni(profesorRequest.getPersona().getDni());
        persona.setDireccion(profesorRequest.getPersona().getDireccion());
        persona.setTelefono(profesorRequest.getPersona().getTelefono());
        persona.setMail(profesorRequest.getPersona().getMail());
        return persona;
    }

    public ProfesorResponse personaToProfesor (Persona persona, List<Materia> materias) {
        ProfesorResponse profesorResponse = new ProfesorResponse();
        PersonaResponse profesor = new PersonaResponse();
        profesor.setNombre(persona.getNombre());
        profesor.setApellido(persona.getApellido());
        profesor.setMail(persona.getMail());
        profesor.setDni(persona.getDni());
        profesor.setTelefono(persona.getTelefono());
        profesor.setDireccion(persona.getDireccion());
        profesorResponse.setProfesor(profesor);
        for (Materia materia : materias
             ) {

        }
//        profesorResponse.setMaterias();
        return null;
    }
}
