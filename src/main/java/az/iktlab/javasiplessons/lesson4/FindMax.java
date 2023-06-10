package az.iktlab.javasiplessons.lesson4;

public class FindMax {

    public static void main(String[] args) {
        int a = 25;
        int b = 78;
        int c = 87;

        // way 1
        int max = 0;
        if (a > b) {
            max = a;
        } else if (a < b) {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        // way 2
        if (a > b && a > c)
            max = a;
        else if (b > a && b > c)
            max = b;
        else max = c;

        // way 3

        max = a > b ? a : b;
        max = max > c ? max : c;


        // way 4

        max = Math.max(Math.max(a, b), c);

        System.out.println(max);
    }
}
