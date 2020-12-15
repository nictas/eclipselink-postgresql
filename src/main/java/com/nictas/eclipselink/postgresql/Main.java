package com.nictas.eclipselink.postgresql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.nictas.eclipselink.postgresql.domain.Human;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(new Human("me"));
        transaction.commit();
        Human me = entityManager.find(Human.class, 1L);
        System.out.println(me.getName());
    }

}
