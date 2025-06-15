package com.example.IntegradorFinalVuelos_MirettiEnzo.entities;

//import javax.persistence.*;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroReserva;

    @Temporal(TemporalType.DATE)
    private Date fechaReserva;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "vuelo_id")
    private Vuelo vuelo;

    @ManyToOne
    @JoinColumn(name = "pago_id")
    private Pago pago;

    // Getters and Setters
    public Long getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(Long numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}
