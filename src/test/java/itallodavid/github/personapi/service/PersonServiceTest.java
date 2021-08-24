package itallodavid.github.personapi.service;

import itallodavid.github.personapi.model.Person;
import itallodavid.github.personapi.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    @Mock
    private PersonRepository repository;

    @InjectMocks
    private PersonService service;

    @Test
    void personPage() {
        Pageable pageable = PageRequest.of(0, 20);
        List<Person> personList = List.of(new Person());
        Page<Person> expectedPage = new PageImpl<>(personList, pageable, personList.size());

        when(repository.findAll(pageable)).thenReturn(expectedPage);

        Page<Person> personPage = service.personPage(pageable);

        assertEquals(expectedPage, personPage);
    }
}