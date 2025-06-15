package com.example.IntegradorFinalVuelos_MirettiEnzo.services;

import com.example.IntegradorFinalVuelos_MirettiEnzo.entities.Aerolinea;
import com.example.IntegradorFinalVuelos_MirettiEnzo.repositories.AerolineaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AerolineaService {

    @Autowired
    private AerolineaRepository aerolineaRepository;

    public Aerolinea guardarAerolinea(Aerolinea aerolinea) {
        return aerolineaRepository.save(aerolinea);
    }
}

