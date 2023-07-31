package az.iktlab.javasiplessons.lesson17.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // with set
        Set<Person> people = getPeople();

        for (Person p : people) {
            if (p.getId() == 3)
                System.out.println(p);
        }

        // with map
        Map<Integer, Person> map = getPeopleMap();
        System.out.println(map.get(3));

        System.out.println(map);

        Map<Integer, Integer> intMap = new HashMap<>();

        intMap.put(1, 3);
        intMap.put(2, 4);
        intMap.put(4, 6);
        intMap.put(1, 8);

        Map<Integer, Integer> intMap2 = new HashMap<>();

        intMap.put(7, 3);
        intMap.put(9, 4);
        intMap.put(12, 6);
        intMap.put(11, 8);

        intMap2.putAll(intMap);

        System.out.println(intMap2);

    }

    private static Set<Person> getPeople() {

        Set<Person> people = new HashSet<>();

        people.add(new Person(2, "name", 23));
        people.add(new Person(3, "name44", 23));
        people.add(new Person(5, "name33", 23));
        people.add(new Person(4, "name22", 23));
        people.add(new Person(1, "name11", 23));

        return people;
    }

    private static Map<Integer, Person> getPeopleMap() {
        Map<Integer, Person> map = new HashMap<>();

        for (Person person : getPeople()) {
            map.put(person.getId(), person);
        }

        return map;
    }
}
