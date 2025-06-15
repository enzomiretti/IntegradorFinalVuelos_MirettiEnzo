package com.example.IntegradorFinalVuelos_MirettiEnzo.entities;

//import javax.persistence.*;
import jakarta.persistence.*;

@Entity
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroPago;

    private int cantidadPago;

    @Enumerated(EnumType.STRING)
    private TipoTarjeta tipoTarjeta;

    // Getters and Setters
    public Long getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(Long numeroPago) {
        this.numeroPago = numeroPago;
    }

    public int getCantidadPago() {
        return cantidadPago;
    }

    public void setCantidadPago(int cantidadPago) {
        this.cantidadPago = cantidadPago;
    }

    public TipoTarjeta getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(TipoTarjeta tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
}
