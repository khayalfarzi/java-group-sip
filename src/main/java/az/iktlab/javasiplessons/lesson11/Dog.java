package az.iktlab.javasiplessons.lesson11;

public class Dog extends Animal {

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
