package com.example.IntegradorFinalVuelos_MirettiEnzo.services;

import com.example.IntegradorFinalVuelos_MirettiEnzo.entities.Pago;
import com.example.IntegradorFinalVuelos_MirettiEnzo.repositories.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoService {

    @Autowired
    private PagoRepository pagoRepository;

    public Pago crearPago(Pago pago) {
        return pagoRepository.save(pago);  // Guarda el pago en la base de datos
    }
}
