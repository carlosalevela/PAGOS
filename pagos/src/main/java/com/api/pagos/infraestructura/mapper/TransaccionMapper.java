package com.api.pagos.infraestructura.mapper;

import com.api.pagos.domain.dto.TransaccionDTO;
import com.api.pagos.infraestructura.entity.Transaccion;

public class TransaccionMapper {
    
    public static TransaccionDTO toDTO(Transaccion transaccion) {
        TransaccionDTO dto = new TransaccionDTO();
        dto.setTransaccionId(transaccion.getTransaccionId());
        dto.setMetodoPagoId(transaccion.getMetodoPagoId());
        dto.setTotal(transaccion.getTotal());
        dto.setFechaCreacion(transaccion.getFechaCreacion());
        dto.setFechaActualizacion(transaccion.getFechaActualizacion());
        return dto;
    }

    public static Transaccion toEntity(TransaccionDTO dto) {
        Transaccion transaccion = new Transaccion();
        transaccion.setTransaccionId(dto.getTransaccionId());
        transaccion.setMetodoPagoId(dto.getMetodoPagoId());
        transaccion.setTotal(dto.getTotal());
        transaccion.setFechaCreacion(dto.getFechaCreacion());
        transaccion.setFechaActualizacion(dto.getFechaActualizacion());
        return transaccion;
    }
}
