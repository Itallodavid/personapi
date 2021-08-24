package itallodavid.github.personapi.service;

import itallodavid.github.personapi.model.Person;
import itallodavid.github.personapi.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    private final PersonRepository repository;

    @Transactional(readOnly = true)
    public Page<Person> personPage(final Pageable pageable){
        return repository.findAll(pageable);
    }
}
