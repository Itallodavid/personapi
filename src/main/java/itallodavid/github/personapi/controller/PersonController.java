package itallodavid.github.personapi.controller;

import itallodavid.github.personapi.model.Person;
import itallodavid.github.personapi.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/people")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private final PersonService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<Person> people(final Pageable pageable){
        return service.personPage(pageable);
    }
}
