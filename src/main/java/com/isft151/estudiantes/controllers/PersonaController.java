package com.isft151.estudiantes.controllers;

import com.isft151.estudiantes.dtos.requests.PersonaRequest;
import com.isft151.estudiantes.dtos.responses.PersonasResponse;
import com.isft151.estudiantes.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Produces;
import java.sql.SQLException;

@RequestMapping("/personas")
@Controller
// Permite generar métodos http
// para la carga, obtención o modificación de datos.
public class PersonaController {


    @Autowired
    private PersonaService personaService;

    // Permite cargar una nueva persona con método POST.
    @PostMapping("/nuevaPersona")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity nuevaPersona(@RequestBody PersonaRequest personaRequest) {

        return personaService.setPersona(personaRequest);
    }

    // Permite listar personas con GET.
    @GetMapping("/listarPersonas")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public PersonasResponse listarPersonas(){

        return personaService.listarPersonas();
    }

    @DeleteMapping("/borrarPersona/{id}")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity borrarPersona(@PathVariable("id") Long id) throws SQLException {

        try {
            personaService.deletePersona(id);
            return ResponseEntity.ok("Registro eliminado");
        }

        catch(Exception ex) {
            return ResponseEntity.badRequest().body("No se pudo eliminar el registro. El error es: " + ex.getMessage());
        }
    }
}
