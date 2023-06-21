package az.iktlab.javasiplessons.lesson8;

public class FactorialWithRecursion {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int digit) {
        return digit > 1 ? digit * factorial(digit - 1) : 1;
    }
}
