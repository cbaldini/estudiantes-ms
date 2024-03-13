package com.isft151.estudiantes.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "profesor")
@Data
public class Profesor {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne
    private Persona persona;
    @OneToMany
    private List<Materia> materias;
}
