package com.isft151.estudiantes.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "examen")
@Entity
@Getter
@Setter
public class Examen {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    private Materia materia;
    private Enum tipoExamen;
    private String legajoEstudiante;
    private Integer calificacion;
}
