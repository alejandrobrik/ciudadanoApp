package com.briki.ciudadano.repositories;

import com.briki.ciudadano.models.Componente;
import com.briki.ciudadano.models.Proyecto;
import com.briki.ciudadano.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {

}
