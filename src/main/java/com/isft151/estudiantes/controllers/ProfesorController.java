package com.isft151.estudiantes.controllers;

import com.isft151.estudiantes.dtos.PersonaRequest;
import com.isft151.estudiantes.dtos.ProfesorRequest;
import com.isft151.estudiantes.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.Produces;
import java.sql.SQLException;

@RequestMapping("/profesores")
@Controller
public class ProfesorController {
    @Autowired
    private ProfesorService profesorService;

    @PostMapping("/nuevoProfesor")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity nuevoProfesor(@RequestBody ProfesorRequest profesorRequest) throws SQLException {

        return profesorService.setProfesor(profesorRequest);
    }
}
