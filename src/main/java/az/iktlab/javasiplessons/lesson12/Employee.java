package az.iktlab.javasiplessons.lesson12;

public class Employee extends Person {

    public void write() {
        System.out.println("Write");
    }

    @Override
    public void run() {
        System.out.println("Employee run");
    }
}
