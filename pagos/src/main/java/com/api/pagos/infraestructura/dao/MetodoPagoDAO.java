package com.api.pagos.infraestructura.dao;

import com.api.pagos.infraestructura.crud_interface.MetodoPagoCrudRepository;
import com.api.pagos.infraestructura.entity.MetodoPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MetodoPagoDAO {

    @Autowired
    private MetodoPagoCrudRepository metodoPagoCrudRepository;

    public MetodoPago save(MetodoPago metodoPago) {
        return metodoPagoCrudRepository.save(metodoPago);
    }

    public Optional<MetodoPago> findById(Long id) {
        return metodoPagoCrudRepository.findById(id);
    }

    public Iterable<MetodoPago> findAll() {
        return metodoPagoCrudRepository.findAll();
    }

    public void deleteById(Long id) {
        metodoPagoCrudRepository.deleteById(id);
    }
}
