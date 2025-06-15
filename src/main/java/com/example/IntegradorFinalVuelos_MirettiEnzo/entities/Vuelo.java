package com.example.IntegradorFinalVuelos_MirettiEnzo.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroVuelo;

    private String origen;
    private String destino;

    // Relación con Reserva
    @OneToMany(mappedBy = "vuelo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reserva> reservas;

    // Relación con Aerolinea (Many-to-One)
    @ManyToOne
    @JoinColumn(name = "aerolinea_id", nullable = false)
    private Aerolinea aerolinea;

    // Relación Many-to-Many con Aeropuerto
    @ManyToMany
    @JoinTable(
            name = "vuelo_aeropuerto",
            joinColumns = @JoinColumn(name = "vuelo_id"),
            inverseJoinColumns = @JoinColumn(name = "aeropuerto_id"))
    private List<Aeropuerto> aeropuertos;

    // Getters y Setters
    public Long getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(Long numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public List<Aeropuerto> getAeropuertos() {
        return aeropuertos;
    }

    public void setAeropuertos(List<Aeropuerto> aeropuertos) {
        this.aeropuertos = aeropuertos;
    }

    // Método auxiliar para añadir una reserva
    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
        reserva.setVuelo(this);  // Establecer la relación bidireccional
    }

    // Método auxiliar para eliminar una reserva
    public void removeReserva(Reserva reserva) {
        reservas.remove(reserva);
        reserva.setVuelo(null);  // Eliminar la relación bidireccional
    }
}
