package az.iktlab.javasiplessons.lesson9;

public class Main {

    public static void main(String[] args) {

        String[] habits = {"habit 1", "habit 2"};
        Pet cat = new Pet();
        cat.nickname = "Samsung";
        cat.species = "SS";
        cat.trickLevel = 40;
        cat.habits = habits;
        cat.age = 12;

        Human human = new Human();
        human.name = "Name of the human";
        human.surname = "Surname of the human";
        human.pet = cat;

        cat.eat();
        cat.respond();
        cat.foul();

        human.greetPet();
        human.describePet();

        System.out.println(cat);
        System.out.println(human);
    }
}
