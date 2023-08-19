package az.iktlab.javasiplessons.lesson23;

import java.util.Objects;

public class Person extends Human {

    private Person father;
    private Person mother;

    public Person(String name, String surname, int age, Person father, Person mother) {
        super(name, surname, age);
        this.father = father;
        this.mother = mother;
    }

    public Person(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(father, person.father) && Objects.equals(mother, person.mother);
    }

    @Override
    public int hashCode() {
        return Objects.hash(father, mother);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = " + getName() +
                ", surname = " + getSurname() +
                ", age = " + getAge() +
                ", father=" + father +
                ", mother=" + mother +
                '}';
    }
}
