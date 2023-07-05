package az.iktlab.javasiplessons.lesson10.inheritance;

public class Accountant extends Employee {

    private double benefit;

    public Accountant(String name, String surname, int age, double salary, double benefit) {
        super(name, surname, age, salary);
        this.benefit = benefit;
    }

    public double getBenefit() {
        return benefit;
    }

    public void setBenefit(double benefit) {
        this.benefit = benefit;
    }
}
