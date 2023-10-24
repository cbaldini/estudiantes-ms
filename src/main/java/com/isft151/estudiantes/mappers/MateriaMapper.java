package com.isft151.estudiantes.mappers;

import com.isft151.estudiantes.dtos.CarreraRequest;
import com.isft151.estudiantes.dtos.MateriaRequest;
import com.isft151.estudiantes.models.Materia;
import org.springframework.stereotype.Service;

@Service
public class MateriaMapper {

    public Materia materiaRequestToMateria(MateriaRequest materiaRequest) {
        Materia materia = new Materia();
        CarreraRequest carreraRequest = new CarreraRequest();
        // Acá tiene que llamar al service para buscar.
        carreraRequest.setNombre(materiaRequest.getNombre());
        materia.setNombre(materiaRequest.getNombre());
        materia.setAnio(materiaRequest.getAnio());

        return null;
    }
}
