package netology.dao_with_hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    @PersistenceContext
    EntityManager entityManager;

    {
        Person timur = Person.builder().name("Timur")
                .surname("Dushanov")
                .age(31)
                .phoneNumber("+7(777) 777-77-77")
                .cityOfLiving("Moscow")
                .build();

        Person anar = Person.builder()
                .name("Anar")
                .surname("Gafarov")
                .age(31)
                .phoneNumber("+7 (111) 111-11-11")
                .cityOfLiving("Moscow")
                .build();

        Person dmitriy = Person.builder()
                .name("Dmitriy")
                .surname("Guliy")
                .age(34)
                .phoneNumber("+7 (999) 999-99-99")
                .cityOfLiving("Moscow")
                .build();

        Person vlad = Person.builder()
                .name("Vladislav")
                .surname("Reznikov")
                .age(42)
                .phoneNumber("+7 (666) 666-66-66")
                .cityOfLiving("Krasnodar")
                .build();
        List<Person> personList = new ArrayList<>();
        entityManager.persist(timur);
        entityManager.persist(anar);
        entityManager.persist(dmitriy);
        entityManager.persist(vlad);


    }
    protected List<Person> getPersonsByCity(String city) {
        Query query = entityManager.createNamedQuery("findAllCases");
        query.setParameter("city", city);
        List<Person> personList = query.getResultList();

        return personList;
    }
}
