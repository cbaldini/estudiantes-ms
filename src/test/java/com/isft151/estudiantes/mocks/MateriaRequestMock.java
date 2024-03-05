package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.dtos.requests.MateriaRequest;

import java.util.ArrayList;
import java.util.List;

public class MateriaRequestMock {

    public static MateriaRequest mockRequest() {
        MateriaRequest materiaRequest = new MateriaRequest();
        materiaRequest.setNombre("Seminario de Programación");
        materiaRequest.setAnio(2);
        materiaRequest.setCarrera(CarreraRequestMock.mockRequest());
        return materiaRequest;
    }

    public static List<MateriaRequest> mockList() {
        List<MateriaRequest> materiaRequestList = new ArrayList<>();
        materiaRequestList.add(mockRequest());
        return materiaRequestList;
    }
}
