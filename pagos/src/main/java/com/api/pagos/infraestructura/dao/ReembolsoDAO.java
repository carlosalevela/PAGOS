package com.api.pagos.infraestructura.dao;

import com.api.pagos.infraestructura.crud_interface.ReembolsoCrudRepository;
import com.api.pagos.infraestructura.entity.Reembolso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ReembolsoDAO {

    @Autowired
    private ReembolsoCrudRepository reembolsoCrudRepository;

    public Reembolso save(Reembolso reembolso) {
        return reembolsoCrudRepository.save(reembolso);
    }

    public Optional<Reembolso> findById(Long id) {
        return reembolsoCrudRepository.findById(id);
    }

    public Iterable<Reembolso> findAll() {
        return reembolsoCrudRepository.findAll();
    }

    public void deleteById(Long id) {
        reembolsoCrudRepository.deleteById(id);
    }
}
