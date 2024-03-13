package com.isft151.estudiantes.mappers;

import com.isft151.estudiantes.dtos.requests.CarreraRequest;
import com.isft151.estudiantes.dtos.requests.MateriaRequest;
import com.isft151.estudiantes.models.Materia;
import org.springframework.stereotype.Service;

@Service
public class MateriaMapper {

    public Materia materiaRequestToMateria(MateriaRequest materiaRequest) {
        Materia materia = Materia.builder()
                .nombre(materiaRequest.getNombre())
                .anio(materiaRequest.getAnio())
                .build();
        CarreraRequest carreraRequest = new CarreraRequest();
        // Acá tiene que llamar al service para buscar.
        carreraRequest.setNombre(materiaRequest.getNombre());

        return null;
    }
}
