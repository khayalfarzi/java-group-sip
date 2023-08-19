package az.iktlab.javasiplessons.lesson23;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = HumanUtil.loadPeople();

//        HumanUtil.showPeopleByNameSortedDesc(people);

//        String data = FileUtil.parseData(people);
//        FileUtil.writeToFile(data,
//                "/Applications/idea/java-group-sip/docs/human.json");

        FileUtil.readFromFile("/Applications/idea/java-group-sip/docs/human.json")
                .forEach(System.out::println);

    }

}
