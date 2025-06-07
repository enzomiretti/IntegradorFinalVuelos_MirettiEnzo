package com.example.demo_MirettiEnzo.services;

import com.example.demo_MirettiEnzo.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {

    List<Persona> search(String filtro) throws Exception;

}
