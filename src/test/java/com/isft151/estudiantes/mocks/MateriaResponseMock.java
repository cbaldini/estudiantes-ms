package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.dtos.requests.MateriaRequest;
import com.isft151.estudiantes.dtos.responses.MateriaResponse;

import java.util.ArrayList;
import java.util.List;

public class MateriaResponseMock {

    public static MateriaResponse mockRequest() {
        MateriaResponse materiaResponse = new MateriaResponse();
        materiaResponse.setNombre("Seminario de Programación");
        materiaResponse.setAnio(2);
        materiaResponse.setCarrera(CarreraResponseMock.mockResponse());
        return materiaResponse;
    }

    public static List<MateriaResponse> mockList() {
        List<MateriaResponse> materiaResponseList = new ArrayList<>();
        materiaResponseList.add(mockRequest());
        return materiaResponseList;
    }
}
