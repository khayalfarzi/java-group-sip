package az.iktlab.javasiplessons.lesson3;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int i = sc.nextInt();
        System.out.println(i);

        System.out.print("Enter double: ");
        double d = sc.nextDouble();
        System.out.println(d);

        String word = "Hello again, today we must learn String and methods";

        System.out.print("Enter index: ");
        int index = sc.nextInt(); // 5

        System.out.println(word.charAt(index - 1));
    }
}
