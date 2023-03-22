package netology.dao_with_hibernate.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Embeddable
public class Contact implements Serializable {
    @Column(length = 50, name = "name", nullable = false)
    private String name;
    @Column(length = 50, name = "surname", nullable = false)
    private String surname;
    @Column(length = 3, name = "age", nullable = false)
    private int age;

}
