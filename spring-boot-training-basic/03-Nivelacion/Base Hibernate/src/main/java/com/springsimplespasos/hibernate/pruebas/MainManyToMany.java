package com.springsimplespasos.hibernate.pruebas;

import com.springsimplespasos.hibernate.entidades.manytomany.Publicacion;
import com.springsimplespasos.hibernate.entidades.manytomany.Usuario;
import com.springsimplespasos.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Arrays;

public class MainManyToMany {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSeccionSessionFactory().openSession();


        Usuario admin = new Usuario(1, "Admin");
        Usuario user = new Usuario(2, "User");

        Publicacion post01 = new Publicacion(1, "Texto del post 01");
        Publicacion post02 = new Publicacion(2, "Texto del post 02");
        Publicacion post10 = new Publicacion(3, "Texto del post 10");
        Publicacion post11 = new Publicacion(4, "Texto del post 11");

        admin.setPublicaciones(Arrays.asList(post01,post02));
        user.setPublicaciones(Arrays.asList(post10, post11, post02));

        session.beginTransaction();

        session.saveOrUpdate(admin);
        session.saveOrUpdate(user);
        session.saveOrUpdate(post01);
        session.saveOrUpdate(post02);
        session.saveOrUpdate(post10);
        session.saveOrUpdate(post11);

        session.getTransaction().commit();
        session.close();
    }
}
