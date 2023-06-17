package az.iktlab.javasiplessons.lesson7;

import java.util.Arrays;

public class MethodExample {

    public static void main(String[] args) {

        methodOne();

        int m2 = methodTwo();
        System.out.println(m2);

        methodThree(6, "Hello", new int[]{5, 2, 4, 6, 8});

        int m4 = methodFour(16);
        System.out.println(m4);
    }

    public static void methodOne() {
        System.out.println("Method one");
        int a = 5;
        byte b = 2;
    }

    public static int methodTwo() {
        System.out.println("Method two");

        return 12 + 5;
    }

    public static void methodThree(int elem, String str, int[] arr) {

        System.out.println("Method three");

        int sqr = elem * elem;

        System.out.println(sqr);
        System.out.println(str);
        System.out.println(Arrays.toString(arr));
    }

    public static int methodFour(int elem) {

        System.out.println("Method four");

        return 2 * elem;
    }
}
