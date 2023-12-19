package com.example.SpringJpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PersonJpaRepo {
   // this is used to connect with Db
    @PersistenceContext
    private EntityManager entityManager;

    public Person findById(int id) {
        // Now you can use the entityManager to interact with the database
        return entityManager.find(Person.class, id);
    }

    public Person update(Person person)
    {
        return entityManager.merge(person);
                // merge is used to update or insert
    }

}
