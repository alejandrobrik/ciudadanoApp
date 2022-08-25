package com.briki.ciudadano.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "proyecto")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "nombre")
    String nombre;

    @ManyToOne
    @JoinColumn(name = "id_componente")
    Componente componente;
}
