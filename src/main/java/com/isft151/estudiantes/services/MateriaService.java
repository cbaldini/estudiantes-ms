package com.isft151.estudiantes.services;

import com.isft151.estudiantes.dtos.requests.MateriaRequest;
import com.isft151.estudiantes.models.Materia;
import com.isft151.estudiantes.repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    public List<Materia> findByNombre(String nombre) {
        return materiaRepository.findByNombre(nombre);
    }

    public Materia save (Materia materia) {
        return materiaRepository.save(materia);
    }

    public Materia setMateriaNuevaOExistente(MateriaRequest materiaRequest, Materia materia) {
        if(materiaRepository.findByNombre(materiaRequest.getNombre()).isEmpty()) {

            materiaRepository.save(materia);
        }
        else {
            materia = materiaRepository.findByNombre(materiaRequest.getNombre()).get(0);
        }
        return materia;
    }
}
