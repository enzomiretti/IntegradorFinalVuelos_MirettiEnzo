package com.example.demo_MirettiEnzo.services;

import com.example.demo_MirettiEnzo.entities.Localidad;
import com.example.demo_MirettiEnzo.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
