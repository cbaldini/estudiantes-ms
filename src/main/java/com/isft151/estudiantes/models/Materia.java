package com.isft151.estudiantes.models;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Table(name = "materia")
@Entity
@Getter
@Builder
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
