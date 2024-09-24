package com.api.pagos.infraestructura.mapper;

import com.api.pagos.domain.dto.MetodoPagoDTO;
import com.api.pagos.infraestructura.entity.MetodoPago;

public class MetodoPagoMapper {
    
    public static MetodoPagoDTO toDTO(MetodoPago metodoPago) {
        MetodoPagoDTO dto = new MetodoPagoDTO();
        dto.setMetodoPagoId(metodoPago.getMetodoPagoId());
        dto.setName(metodoPago.getName());
        dto.setFechaCreacion(metodoPago.getFechaCreacion());
        dto.setFechaActualizacion(metodoPago.getFechaActualizacion());
        return dto;
    }

    public static MetodoPago toEntity(MetodoPagoDTO dto) {
        MetodoPago metodoPago = new MetodoPago();
        metodoPago.setMetodoPagoId(dto.getMetodoPagoId());
        metodoPago.setName(dto.getName());
        metodoPago.setFechaCreacion(dto.getFechaCreacion());
        metodoPago.setFechaActualizacion(dto.getFechaActualizacion());
        return metodoPago;
    }
}
