package com.api.pagos.infraestructura.crud_interface;

import com.api.pagos.infraestructura.entity.Transaccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionCrudRepository extends CrudRepository<Transaccion, Long> {
    
}

