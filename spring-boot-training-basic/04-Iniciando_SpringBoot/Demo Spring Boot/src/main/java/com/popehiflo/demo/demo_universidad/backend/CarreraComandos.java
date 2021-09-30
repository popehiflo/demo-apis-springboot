package com.popehiflo.demo.demo_universidad.backend;

import com.popehiflo.demo.demo_universidad.backend.modelo.entidades.Carrera;
import com.popehiflo.demo.demo_universidad.backend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/* anotacion para inyectar la clase como bean, y poder ser
* usado desde el spring boot */
@Component
public class CarreraComandos implements CommandLineRunner {

    @Autowired
    private CarreraDAO servicio;

    @Override
    public void run(String... args) throws Exception {
        Carrera ingSistemas = new Carrera(null, "Ingenieria de Sistemas", 50, 5);
        Carrera save = servicio.save(ingSistemas);
        System.out.println(save.toString());
    }
}
