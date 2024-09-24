package com.api.pagos.infraestructura.entity;

import java.time.LocalDateTime;

public class Reembolso {
    private Long reembolsoId;
    private Long transaccionId; // Referencia a Transaccion
    private String causa;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

    // Constructor vacío
    public Reembolso() {
    }

    // Constructor con parámetros
    public Reembolso(Long reembolsoId, Long transaccionId, String causa, LocalDateTime fechaCreacion, LocalDateTime fechaActualizacion) {
        this.reembolsoId = reembolsoId;
        this.transaccionId = transaccionId;
        this.causa = causa;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    // Getters y Setters
    public Long getReembolsoId() {
        return reembolsoId;
    }

    public void setReembolsoId(Long reembolsoId) {
        this.reembolsoId = reembolsoId;
    }

    public Long getTransaccionId() {
        return transaccionId;
    }

    public void setTransaccionId(Long transaccionId) {
        this.transaccionId = transaccionId;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
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
