package com.example.demo_MirettiEnzo.services;

import com.example.demo_MirettiEnzo.entities.Autor;
import com.example.demo_MirettiEnzo.repositories.AutorRepository;
import com.example.demo_MirettiEnzo.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
