package mykhailo.tsiuniak;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    public static void main(String[] args) {

        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("blablabla");
        EntityManager em = factory.createEntityManager();

        em.close();
         factory.close();
    }
}
