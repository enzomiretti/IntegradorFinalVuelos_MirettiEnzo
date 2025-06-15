package com.example.IntegradorFinalVuelos_MirettiEnzo.repositories;

import com.example.IntegradorFinalVuelos_MirettiEnzo.entities.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VueloRepository extends JpaRepository<Vuelo, Long> {
}
