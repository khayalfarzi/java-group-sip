package az.iktlab.javasiplessons.lesson23;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = HumanUtil.loadPeople();

        HumanUtil.showPeopleByNameSortedDesc(people);

    }

}
