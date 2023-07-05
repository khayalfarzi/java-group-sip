package az.iktlab.javasiplessons.lesson10.encapsulation;

public class Person {

    private  final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;

        if (age < 0) {
            System.out.println("Age can not be negative");
            this.age = 0;
        } else if (age > 250) {
            System.out.println("Age can not be more than 250");
            this.age = 0;
        } else this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
