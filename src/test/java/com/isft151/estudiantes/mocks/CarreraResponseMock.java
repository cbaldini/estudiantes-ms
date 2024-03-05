package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.dtos.requests.CarreraRequest;
import com.isft151.estudiantes.dtos.requests.CarreraResponse;

public class CarreraResponseMock {

    public static CarreraResponse mockResponse() {
        CarreraResponse carreraResponse = new CarreraResponse();
        carreraResponse.setNombre("Técnico Superior en Análisis, Desarrollo y Programación de Aplicaciones");
        return carreraResponse;
    }
}
