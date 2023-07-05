package az.iktlab.javasiplessons.lesson10.inheritance;

public class Employee extends Person {

    private double salary;

    public Employee(String name, String surname, int age, double salary) {
        super(name, surname, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
