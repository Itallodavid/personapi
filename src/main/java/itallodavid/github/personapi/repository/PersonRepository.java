package itallodavid.github.personapi.repository;

import itallodavid.github.personapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {
}
