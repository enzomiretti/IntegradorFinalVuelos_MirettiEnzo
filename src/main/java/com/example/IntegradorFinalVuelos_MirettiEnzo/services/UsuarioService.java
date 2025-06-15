package com.example.IntegradorFinalVuelos_MirettiEnzo.services;

import com.example.IntegradorFinalVuelos_MirettiEnzo.entities.Usuario;
import com.example.IntegradorFinalVuelos_MirettiEnzo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);  // Guarda el usuario en la base de datos
    }
}
