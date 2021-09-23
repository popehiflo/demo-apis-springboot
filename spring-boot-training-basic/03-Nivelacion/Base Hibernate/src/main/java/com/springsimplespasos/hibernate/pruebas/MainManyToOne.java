package com.springsimplespasos.hibernate.pruebas;

import com.springsimplespasos.hibernate.entidades.manytoone.Persona;
import com.springsimplespasos.hibernate.entidades.manytoone.Telefono;
import com.springsimplespasos.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Arrays;

public class MainManyToOne {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSeccionSessionFactory().openSession();

        Persona pool = new Persona(null, "Pool");
        Persona petter = new Persona(null, "Petter");

        Telefono celularPool = new Telefono(null, "1111111111");
        Telefono casaPool = new Telefono(null, "2222222222");

        celularPool.setPersona(pool);
        casaPool.setPersona(pool);

        pool.setTelefonos(Arrays.asList(celularPool, casaPool));

        session.beginTransaction();

        /*session.save(pool);
        session.save(petter);*/

        Persona persona = session.get(Persona.class, 3);
        persona.getTelefonos().forEach(telefono -> System.out.println(telefono.getNumero()));

        session.getTransaction().commit();
        session.close();
    }
}
