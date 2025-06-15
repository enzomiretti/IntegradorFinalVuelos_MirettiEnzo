package com.example.IntegradorFinalVuelos_MirettiEnzo.repositories;

import com.example.IntegradorFinalVuelos_MirettiEnzo.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
