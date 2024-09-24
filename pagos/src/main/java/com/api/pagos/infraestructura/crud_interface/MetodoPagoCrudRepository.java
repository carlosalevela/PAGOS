package com.api.pagos.infraestructura.crud_interface;

import com.api.pagos.infraestructura.entity.MetodoPago;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoPagoCrudRepository extends CrudRepository<MetodoPago, Long> {
    
}
