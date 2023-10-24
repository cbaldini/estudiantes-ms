package com.isft151.estudiantes.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "persona")
@Entity
@Getter
@Setter
public class Persona {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String mail;
    private String direccion;
}
