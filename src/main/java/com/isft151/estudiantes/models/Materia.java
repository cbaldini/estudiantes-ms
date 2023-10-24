package com.isft151.estudiantes.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "materia")
@Entity
@Getter
@Setter
public class Materia {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String nombre;
    @ManyToOne
    private Carrera carrera;
    private Integer anio;
}
