package com.example.gtics_lab10_20212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tablero")
public class Tablero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "dimensiones")
    private String dimensiones;

    @Column(name = "filas")
    private Integer filas;

    @Column(name = "columnas")
    private Integer columnas;

}
