package com.briki.ciudadano.models;

import lombok.*;

import javax.persistence.*;


@Entity
@Data
@Table(name = "encuesta")
public class Encuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "estado")
    boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_proyecto")
    Proyecto proyecto;
}
