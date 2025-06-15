package com.example.IntegradorFinalVuelos_MirettiEnzo.repositories;

import com.example.IntegradorFinalVuelos_MirettiEnzo.entities.Aerolinea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AerolineaRepository extends JpaRepository<Aerolinea, Long> {
}
