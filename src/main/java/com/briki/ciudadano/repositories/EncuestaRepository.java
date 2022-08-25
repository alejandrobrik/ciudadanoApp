package com.briki.ciudadano.repositories;

import com.briki.ciudadano.models.Encuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncuestaRepository extends JpaRepository<Encuesta, Integer> {
}
