package az.iktlab.javasiplessons.lesson25.smallapp.controller;

import az.iktlab.javasiplessons.lesson25.smallapp.model.Person;
import az.iktlab.javasiplessons.lesson25.smallapp.service.PersonService;

import java.util.List;

public class PersonController {

    private final PersonService personService = new PersonService();

    public void save(Person person) {
        personService.save(person);
    }

    public List<Person> findAll() {
        return personService.findAll();
    }
}
