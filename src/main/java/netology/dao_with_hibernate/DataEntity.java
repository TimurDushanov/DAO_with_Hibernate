package netology.dao_with_hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataEntity implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Person anar = Person.builder().contact(Contact.builder()
                        .name("Anar")
                        .surname("Gafarov")
                        .age(31)
                        .build())
                .phoneNumber("+7 (111) 111-11-11")
                .cityOfLiving("Moscow")
                .build();

        Person dmitriy = Person.builder().contact(Contact.builder()
                        .name("Dmitriy")
                        .surname("Guliy")
                        .age(34)
                        .build())
                .phoneNumber("+7 (999) 999-99-99")
                .cityOfLiving("Moscow")
                .build();

        Person vlad = Person.builder().contact(Contact.builder()
                        .name("Vladislav")
                        .surname("Reznikov")
                        .age(42)
                        .build())
                .phoneNumber("+7 (666) 666-66-66")
                .cityOfLiving("Krasnodar")
                .build();
//        entityManager.persist(anar);
//        entityManager.persist(dmitriy);
//        entityManager.persist(vlad);
    }
}
