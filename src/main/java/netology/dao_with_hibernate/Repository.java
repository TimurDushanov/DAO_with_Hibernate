package netology.dao_with_hibernate;

import netology.dao_with_hibernate.Model.Contact;
import netology.dao_with_hibernate.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Person, Contact> {

    List<Person> findPersonByCityOfLiving(String city);

    List<Person> findPersonByContact_AgeBeforeOrderByContactAsc(Integer age);

    Optional<Person> findPersonByContact_NameContainingIgnoreCaseAndAndContact_SurnameContainingIgnoreCase(String name, String surname);

}
