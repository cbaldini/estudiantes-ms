package com.isft151.estudiantes.controllers;

import com.isft151.estudiantes.dtos.requests.ProfesorRequest;
import com.isft151.estudiantes.dtos.responses.ProfesorResponse;
import com.isft151.estudiantes.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @DeleteMapping("/borrarProfesor/{id}")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity borrarProfesor(@PathVariable("id") Long id) throws SQLException {

        try {
            profesorService.deleteProfesor(id);
            return ResponseEntity.ok("Registro eliminado");
        }

        catch(Exception ex) {
            return ResponseEntity.badRequest().body("No se pudo eliminar el registro. El error es: " + ex.getMessage());
        }
    }

    // Permite listar personas con GET.
    @GetMapping("/listarProfesores")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ProfesorResponse listarPersonas(){

//        return profesorService.
        return null;
    }

}
