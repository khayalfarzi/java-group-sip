package az.iktlab.javasiplessons.lesson14.gc;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 1_000_000_000; i++) {
            new Human();
            System.gc();
        }
    }
}
