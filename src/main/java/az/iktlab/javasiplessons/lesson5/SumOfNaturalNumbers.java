package az.iktlab.javasiplessons.lesson5;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");

        int digit = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < digit; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
