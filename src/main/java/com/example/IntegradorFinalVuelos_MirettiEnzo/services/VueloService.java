package com.example.IntegradorFinalVuelos_MirettiEnzo.services;

import com.example.IntegradorFinalVuelos_MirettiEnzo.entities.Vuelo;
import com.example.IntegradorFinalVuelos_MirettiEnzo.repositories.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VueloService {

    @Autowired
    private VueloRepository vueloRepository;

    public Vuelo crearVuelo(Vuelo vuelo) {
        return vueloRepository.save(vuelo);  // Guarda el vuelo en la base de datos
    }
}
