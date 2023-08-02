package az.iktlab.javasiplessons.lesson18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Stream {

    static Predicate<Person> isEqual = it -> it.getId() == 2;
    static Consumer<Person> print = it -> System.out.println(it);

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person(1, "name 1"),
                new Person(2, "name 2"),
                new Person(3, "name 3"),
                new Person(4, "name 4"),
                new Person(5, "name 5"));

        for (Person p : people)
            if (p.getId() == 2)
                System.out.println(p);

        people.stream().filter(isEqual).forEach(print);


        List<String> names = new ArrayList<>();

        for (Person p : people)
            names.add(p.getName());
        System.out.println(names);

        List<String> namesStream = people.stream().map(Person::getName).toList();

        System.out.println(namesStream);
    }
}
