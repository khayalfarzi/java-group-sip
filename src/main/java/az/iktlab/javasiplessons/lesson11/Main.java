package az.iktlab.javasiplessons.lesson11;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();
        human.run();
        human.defaultMethod();

        human.sub(1, 5555555);

        Animal animal = new Animal();
        animal.run();

        Alive.staticMethod();

        Dog dog = new Dog();
        dog.run();
    }
}
