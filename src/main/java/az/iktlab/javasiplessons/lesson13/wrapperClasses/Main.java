package az.iktlab.javasiplessons.lesson13.wrapperClasses;

public class Main {

    public static void main(String[] args) {

        int a = 5;
        double d = 8.0;
        int c = (int) d;

        String number = "98";

        int num = Integer.parseInt(number);


        Person person = new Person();

        System.out.println(person.getAge());
        System.out.println(person.getAge1());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
