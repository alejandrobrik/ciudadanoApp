package com.briki.ciudadano.repositories;

import com.briki.ciudadano.models.UsuarioComponente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioComponenteRepository extends JpaRepository<UsuarioComponente, Integer> {
}
