package com.isft151.estudiantes.mocks;

import com.isft151.estudiantes.dtos.requests.CarreraRequest;

public class CarreraRequestMock {

    public static CarreraRequest mockRequest() {
        CarreraRequest carreraRequest = new CarreraRequest();
        carreraRequest.setNombre("Técnico Superior en Análisis, Desarrollo y Programación de Aplicaciones");
        return carreraRequest;
    }
}
