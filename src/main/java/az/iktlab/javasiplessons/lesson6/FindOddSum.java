package az.iktlab.javasiplessons.lesson6;

import java.util.Scanner;

public class FindOddSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int limit = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < limit; i++) {

            if ((i % 2) != 0)
                sum += i;
        }

        System.out.println(sum);

        for (int i = 1; i < limit; i += 2) {
            sum += i;
        }

    }
}
