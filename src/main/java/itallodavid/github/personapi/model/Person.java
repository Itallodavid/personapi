package itallodavid.github.personapi.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity @Audited
@Getter @Setter
public class Person {

    @Id
    private String cpf;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Phone> phones = new ArrayList<>();
}
