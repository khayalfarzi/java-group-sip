package az.iktlab.javasiplessons.lesson5;

public class Fibonacci {

    public static void main(String[] args) {
        int index = 10;
        int first = 0;
        int second = 1;
        int i = 0;

        System.out.println(first);
        System.out.println(second);

        while (i < index) {
            int sum = first + second;

            System.out.println(sum);
            i = sum;
            first = second;
            second = sum;
        }
    }
}
