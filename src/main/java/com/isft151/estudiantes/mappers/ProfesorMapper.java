package com.isft151.estudiantes.mappers;

import com.isft151.estudiantes.dtos.*;
import com.isft151.estudiantes.models.Materia;
import com.isft151.estudiantes.models.Persona;
import com.isft151.estudiantes.models.Profesor;
import com.isft151.estudiantes.repositories.MateriaRepository;
import com.isft151.estudiantes.repositories.PersonaRepository;
import com.isft151.estudiantes.services.MateriaService;
import com.isft151.estudiantes.services.PersonaService;
import com.isft151.estudiantes.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ProfesorMapper {

    @Autowired
    private MateriaService materiaService;

    @Autowired
    private PersonaService personaService;

    @Autowired
    private ProfesorService profesorService;

    public Profesor profesorRequestToProfesor(ProfesorRequest profesorRequest){

        Profesor profesor = new Profesor();
        profesorService.setPersonaNuevaOExistente(profesorRequest, profesor);
        List<Materia> materiaList = new ArrayList<>();
        for (MateriaRequest materiaRequest :profesorRequest.getMaterias()) {

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
        personaService.save(persona);
        return persona;
    }
}
