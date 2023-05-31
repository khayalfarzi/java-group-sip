package az.iktlab.javasiplessons.lesson2;

public class LogicalOperatorsExample {

    public static void main(String[] args) {

        int a = 5;
        int b = 8;

        System.out.println(a > 10 && b < 9);
        System.out.println(a > 10 || b < 9);

        System.out.println(a > 10 & b < 9);
        System.out.println(a > 10 | b < 9);

        boolean x , y = true, z, t;

//        System.out.println((x = true) & (y = false));
//        System.out.println((x = true) & (y = true));

        System.out.println((x = false) & (y = false));

        System.out.println(x); // true
        System.out.println(y); // true
    }
}
