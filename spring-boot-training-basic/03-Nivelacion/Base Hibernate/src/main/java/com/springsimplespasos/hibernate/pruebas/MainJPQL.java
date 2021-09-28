package com.springsimplespasos.hibernate.pruebas;

import com.springsimplespasos.hibernate.entidades.manytoone.Persona;
import com.springsimplespasos.hibernate.entidades.manytoone.Telefono;
import com.springsimplespasos.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class MainJPQL {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSeccionSessionFactory().openSession();

        // SQL NATIVO
        /*SELECT * FROM personas WHERE codigo = ? */

        Query query = session.createQuery("select p from Persona p where p.codigo = ?1");
        query.setParameter(1, Integer.parseInt("3"));

        Persona persona = (Persona)query.getSingleResult();
        System.out.println(persona.getNombre());

        /*SELECT * FROM personas p JOIN telefonos t ON p.codigo = t.persona_id WHERE p.codigo = ? */
        Query queryTelf = session.createQuery("select p.telefonos from Persona p where p.codigo = :codigo");
        queryTelf.setParameter("codigo", Integer.parseInt("3"));

        List<Telefono> telefonos = (List<Telefono>) queryTelf.getResultList();
        telefonos.forEach(telf -> System.out.println(telf.getNumero()));

        session.close();
    }
}
