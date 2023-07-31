package az.iktlab.javasiplessons.lesson17.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(1);

        System.out.println(set);

        Set<Person> pset = new HashSet<>();
        pset.add(new Person("name", 12));
        pset.add(new Person("name5", 1));
        pset.add(new Person("name1", 24));

        System.out.println(pset);

        pset.forEach(p -> System.out.println(p.hashCode()));


    }
}
