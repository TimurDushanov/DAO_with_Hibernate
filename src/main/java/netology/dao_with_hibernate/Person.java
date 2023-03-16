package netology.dao_with_hibernate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "persons")
@NamedQuery(
        name = "findPersonVyCity",
        query = "select p from persons p where p.city_of_living = :city"
)
public class Person {
    @Id
    @Column(length = 50, name = "name")
    private String name;
    @Id
    @Column(length = 50, name = "surname")
    private String surname;
    @Id
    @Column(length = 3, name = "age")
    private int age;
    @Column(length = 25, name = "phone_number", nullable = false)
    private String phoneNumber;
    @Column(length = 50, name = "city_of_living", nullable = false)
    private String cityOfLiving;


}
