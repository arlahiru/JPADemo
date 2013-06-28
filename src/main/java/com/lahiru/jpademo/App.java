package com.lahiru.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemoPU");
        
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();
        
        Student s1 = new Student();

        s1.setName("Saman");
        s1.setAge(12);
        em.persist(s1);
       
        s1.setAge(24);
        
        em.getTransaction().commit();
        
        em.getTransaction().begin();
        
        Student s2 = new Student();

        s2.setName("Nimal");
        s2.setAge(15);
        
        em.merge(s2);
       
        s2.setAge(30);
        
        em.getTransaction().commit();


    }
}
