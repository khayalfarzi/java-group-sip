package az.iktlab.javasiplessons.lesson9;

import java.util.Arrays;
import java.util.Objects;

public class Human {

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mather) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mather = mather;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human father, Human mather, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mather = mather;
        this.schedule = schedule;
    }

    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;
    public Human father;
    public Human mather;
    public String[][] schedule;

    public void greetPet() {
        System.out.printf("Hello, %s\n", pet.nickname);
    }

    public void describePet() {

        if (pet.trickLevel >= 50)
            System.out.printf("I have a %s, he is %s years old, he is very sly\n", pet.species, pet.age);
        else
            System.out.printf("I have a %s, he is %s years old, he is almost not sly\n", pet.species, pet.age);

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", father=" + father +
                ", mather=" + mather +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
