package com.example.IntegradorFinalVuelos_MirettiEnzo.controllers;

import com.example.IntegradorFinalVuelos_MirettiEnzo.entities.*;
import com.example.IntegradorFinalVuelos_MirettiEnzo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservaController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private VueloService vueloService;

    @Autowired
    private PagoService pagoService;

    @Autowired
    private ReservaService reservaService;

    @Autowired
    private AerolineaService aerolineaService;

    @GetMapping("/")
    public String home() {
        return "redirect:/reservaFormulario";
    }

    @GetMapping("/reservaFormulario")
    public String mostrarFormularioReserva(Model model) {
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("vuelo", new Vuelo());
        model.addAttribute("pago", new Pago());
        return "reserva";
    }

    @PostMapping("/crearReserva")
    public String crearReserva(Usuario usuario, Vuelo vuelo, Pago pago,
                               @RequestParam("aerolineaNombre") String aerolineaNombre,
                               Model model) {

        usuarioService.crearUsuario(usuario);

        Aerolinea aerolinea = new Aerolinea();
        aerolinea.setNombre(aerolineaNombre);
        aerolinea = aerolineaService.guardarAerolinea(aerolinea);

        vuelo.setAerolinea(aerolinea);
        vueloService.crearVuelo(vuelo);
        pagoService.crearPago(pago);

        Reserva reserva = new Reserva();
        reserva.setUsuario(usuario);
        reserva.setVuelo(vuelo);
        reserva.setPago(pago);
        reservaService.crearReserva(reserva);

        model.addAttribute("reserva", reserva);
        return "reservaConfirmada";
    }
}
