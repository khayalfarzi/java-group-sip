package az.iktlab.javasiplessons.lesson10.encapsulation;

import java.util.Scanner;

public class NbyNMatrix {

    public static void main(String[] args) {

        // 3
        // * * *
        // * * *
        // * * *

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%s ", "*");
            }
            System.out.println();
        }
    }
}
