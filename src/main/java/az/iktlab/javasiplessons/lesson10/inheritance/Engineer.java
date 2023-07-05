package az.iktlab.javasiplessons.lesson10.inheritance;

public class Engineer extends Employee {
    private double bonus;

    public Engineer(double bonus, String name,
                    String surname, int age, double salary) {
        super(name, surname, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
