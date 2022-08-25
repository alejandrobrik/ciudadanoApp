package com.briki.ciudadano.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "componente")
public class Componente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "descripcion")
    String descripcion;


}
