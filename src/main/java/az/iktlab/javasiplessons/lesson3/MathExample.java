package az.iktlab.javasiplessons.lesson3;

public class MathExample {

    public static void main(String[] args) {

        System.out.println(Math.max(5, 7));
        System.out.println(Math.min(5, 7));

        System.out.println((int) (Math.random() * 100));

        // 3, 7, 2

        int min = Math.min(3, 7);
        int secMin = Math.min(2, min);

        System.out.println(Math.min(3, Math.min(2, 7)));
    }
}
