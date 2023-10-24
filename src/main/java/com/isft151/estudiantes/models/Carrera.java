package com.isft151.estudiantes.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "carrera")
@Entity
@Getter
@Setter
public class Carrera {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String nombre;
}
