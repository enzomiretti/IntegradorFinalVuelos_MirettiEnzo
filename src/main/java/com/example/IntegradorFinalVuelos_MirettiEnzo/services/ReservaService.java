package com.example.IntegradorFinalVuelos_MirettiEnzo.services;

import com.example.IntegradorFinalVuelos_MirettiEnzo.entities.Reserva;
import com.example.IntegradorFinalVuelos_MirettiEnzo.repositories.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva crearReserva(Reserva reserva) {
        return reservaRepository.save(reserva);  // Guarda la reserva en la base de datos
    }
}
