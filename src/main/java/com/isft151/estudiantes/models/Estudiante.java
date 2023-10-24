package com.isft151.estudiantes.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "estudiante")
@Entity
@Getter
@Setter
public class Estudiante {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @OneToOne
    private Persona persona;
    private String legajo;
}
