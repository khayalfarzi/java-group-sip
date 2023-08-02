package az.iktlab.javasiplessons.lesson18;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        checkPerson(null);

//        Person person = Optional.of(null)
////                .orElse(new Person())
//                .orElseThrow();

    }

    private static void checkPerson(Optional<Person> person) {

        Person p = person.orElseThrow();

        if (p.getId() < 0)
            System.out.println("Id must be positive");

        if (p.getName() == null)
            System.out.println("empty name");
    }
}
