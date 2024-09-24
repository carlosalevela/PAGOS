package com.api.pagos.infraestructura.crud_interface;

import com.api.pagos.infraestructura.entity.Reembolso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReembolsoCrudRepository extends CrudRepository<Reembolso, Long> {
}
