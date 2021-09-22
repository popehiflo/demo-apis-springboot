package com.springsimplespasos.hibernate.pruebas;

import com.springsimplespasos.hibernate.entidades.SimpleEntity;
import com.springsimplespasos.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class HibernateMain {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSeccionSessionFactory().openSession();
        session.beginTransaction();

        /* Create */
        /*SimpleEntity entity = new SimpleEntity();
        entity.setNombre("primer row");
        session.save(entity);*/

        /* Update */
        /*SimpleEntity entityUpdate = new SimpleEntity();
        entityUpdate.setCodigo(2);
        entityUpdate.setNombre("Nombre UPDATE");
        session.update(entityUpdate);*/

        /* Delete */
       /* SimpleEntity entityDelete = new SimpleEntity();
        entityDelete.setCodigo(2);
        entityDelete.setNombre("Nombre UPDATE");
        session.delete(entityDelete);*/

        /* Read */
        SimpleEntity entityRead = session.get(SimpleEntity.class, 1);
        System.out.println(entityRead.getNombre());

        session.getTransaction().commit();
        session.close();
    }

}
