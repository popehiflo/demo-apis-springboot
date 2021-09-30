package com.popehiflo.demo.demo_universidad.backend.repositorios;

import com.popehiflo.demo.demo_universidad.backend.modelo.entidades.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends CrudRepository <Carrera, Integer> {


}
