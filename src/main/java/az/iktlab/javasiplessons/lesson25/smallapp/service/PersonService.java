package az.iktlab.javasiplessons.lesson25.smallapp.service;

import az.iktlab.javasiplessons.lesson25.smallapp.dao.PersonRepo;
import az.iktlab.javasiplessons.lesson25.smallapp.model.Person;

import java.util.List;

public class PersonService {

    private final PersonRepo repo = new PersonRepo();

    public void save(Person person) {
        repo.save(person);
    }

    public List<Person> findAll() {
        return repo.findAll();
    }
}
