package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
            EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
            EntityManager em=emf.createEntityManager();

            em.getTransaction().begin();

            Alien s1=new Alien();
            s1.setAid(101);
            s1.setAname("Gaurav");
            s1.setTech("abc");

            Alien s2=new Alien();
            s2.setAid(102);
            s2.setAname("Rohit sharma");
            s2.setTech("bcd");

            Alien s3=new Alien();
            s3.setAid(103);
            s3.setAname("Rahul Gandhi");
            s3.setTech("cde");

            em.persist(s1);
            em.persist(s2);
            em.persist(s3);

            em.getTransaction().commit();
            emf.close();
            em.close();
    }
}

