package az.iktlab.javasiplessons.lesson4;

public class IfElseExample {

    public static void main(String[] args) {

        int a = 7;
        int b = 18;

        String result = "";

        if (a < b)
            result = "NEQATIVE";
        else if (a > b) {
            System.out.println("Salam");
            System.out.println("Salam");
            System.out.println("Salam");
            System.out.println("Salam");
            result = "POSITIVE";
        } else
            result = "EQUAL";

        System.out.println(result);
    }
}
