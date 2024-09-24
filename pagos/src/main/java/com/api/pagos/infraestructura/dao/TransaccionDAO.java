package com.api.pagos.infraestructura.dao;

import com.api.pagos.infraestructura.crud_interface.TransaccionCrudRepository;
import com.api.pagos.infraestructura.entity.Transaccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TransaccionDAO {

    @Autowired
    private TransaccionCrudRepository transaccionCrudRepository;

    public Transaccion save(Transaccion transaccion) {
        return transaccionCrudRepository.save(transaccion);
    }

    public Optional<Transaccion> findById(Long id) {
        return transaccionCrudRepository.findById(id);
    }

    public Iterable<Transaccion> findAll() {
        return transaccionCrudRepository.findAll();
    }

    public void deleteById(Long id) {
        transaccionCrudRepository.deleteById(id);
    }
}
