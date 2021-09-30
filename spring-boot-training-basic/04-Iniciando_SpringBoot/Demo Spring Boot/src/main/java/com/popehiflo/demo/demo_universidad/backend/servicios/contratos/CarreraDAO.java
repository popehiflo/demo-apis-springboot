package com.popehiflo.demo.demo_universidad.backend.servicios.contratos;

import com.popehiflo.demo.demo_universidad.backend.modelo.entidades.Carrera;

import java.util.Optional;

public interface CarreraDAO {

    Optional<Carrera> findById(Integer id);
    Carrera save(Carrera carrera);
    Iterable<Carrera> findAll();
    void deleteById(Integer id);
}
