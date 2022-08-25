package com.briki.ciudadano.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "usuario_componente")
public class UsuarioComponente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "aporte")
    String aporte;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_componente")
    Componente componente;
}
