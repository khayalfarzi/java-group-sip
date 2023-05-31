package az.iktlab.javasiplessons.lesson2;

public class RelationalOperatorsExample {

    public static void main(String[] args) {

        int a = 8;
        int b = 7;

        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a != b);
        System.out.println(a >=b);
        System.out.println(a <=b);

//        System.out.println(a-- == b);

        System.out.println(a-- == ++b);
    }
}
