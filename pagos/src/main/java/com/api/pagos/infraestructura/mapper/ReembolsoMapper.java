package com.api.pagos.infraestructura.mapper;

import com.api.pagos.domain.dto.ReembolsoDTO;
import com.api.pagos.infraestructura.entity.Reembolso;

public class ReembolsoMapper {
    
    public static ReembolsoDTO toDTO(Reembolso reembolso) {
        ReembolsoDTO dto = new ReembolsoDTO();
        dto.setRembolsoId(reembolso.getReembolsoId());
        dto.setTransaccionId(reembolso.getTransaccionId());
        dto.setCausa(reembolso.getCausa());
        dto.setFechaCreacion(reembolso.getFechaCreacion());
        dto.setFechaActualizacion(reembolso.getFechaActualizacion());
        return dto;
    }

    public static Reembolso toEntity(ReembolsoDTO dto) {
        Reembolso reembolso = new Reembolso();
        reembolso.setReembolsoId(dto.getRembolsoId());
        reembolso.setTransaccionId(dto.getTransaccionId());
        reembolso.setCausa(dto.getCausa());
        reembolso.setFechaCreacion(dto.getFechaCreacion());
        reembolso.setFechaActualizacion(dto.getFechaActualizacion());
        return reembolso;
    }
}
