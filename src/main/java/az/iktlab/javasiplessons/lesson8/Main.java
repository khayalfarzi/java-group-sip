package az.iktlab.javasiplessons.lesson8;

public class Main {

    public static void main(String[] args) {

        Person ali = new Person();

        ali.name = "Ali";
        ali.surname = "Alili";
        ali.age = 28;

        ali.run();


        Person vali = new Person();
        vali.name = "Vali";
        vali.surname = "Valiyev";
        vali.age = 98;

        System.out.printf("Ali: name: %s , surname: %s , age: %s\n", ali.name, ali.surname, ali.age);
        System.out.printf("Vali: name: %s , surname: %s , age: %s", vali.name, vali.surname, vali.age);
    }
}
