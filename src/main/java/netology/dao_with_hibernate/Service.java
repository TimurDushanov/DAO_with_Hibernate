package netology.dao_with_hibernate;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {


    private Repository repository;

    @Transactional
    protected List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
