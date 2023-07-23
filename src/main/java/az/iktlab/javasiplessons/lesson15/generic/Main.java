package az.iktlab.javasiplessons.lesson15.generic;

public class Main {

    public static void main(String[] args) {

        Type<Integer> intType = new Type<>();
        intType.setElement(123);
        System.out.println(intType);

        Type<Double> doubleType = new Type<>();
        doubleType.setElement(46.25);
        System.out.println(doubleType);
    }
}
