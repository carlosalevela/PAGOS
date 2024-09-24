package com.api.pagos.infraestructura.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaccion {
    private Long transaccionId;
    private Long metodoPagoId; // Referencia a MetodoPago
    private BigDecimal total;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

    public Transaccion() {
    }


    public Transaccion(Long transaccionId, Long metodoPagoId, BigDecimal total, LocalDateTime fechaCreacion, LocalDateTime fechaActualizacion) {
        this.transaccionId = transaccionId;
        this.metodoPagoId = metodoPagoId;
        this.total = total;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    // Getters y Setters
    public Long getTransaccionId() {
        return transaccionId;
    }

    public void setTransaccionId(Long transaccionId) {
        this.transaccionId = transaccionId;
    }

    public Long getMetodoPagoId() {
        return metodoPagoId;
    }

    public void setMetodoPagoId(Long metodoPagoId) {
        this.metodoPagoId = metodoPagoId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
