package az.iktlab.javasiplessons.lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = 6;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 8;

        while (true) {
            System.out.print("Enter value (format: 1-4 or exit): ");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                System.out.println("Program end.");
                break;
            }

            String[] parts = input.split("-");

            if (parts.length != 2) {
                System.out.println("Invalid input format. Please try again.");
                continue;
            }

            int index = Integer.parseInt(parts[0]);
            int element = Integer.parseInt(parts[1]);

            if (index < 0 || index > arr.length) {
                System.out.println("Invalid index. Please try again.");
                continue;
            }

            int[] newArray = new int[arr.length + 1];

            System.arraycopy(arr, 0, newArray, 0, index);

            newArray[index] = element;

            System.arraycopy(arr, index, newArray, index + 1, arr.length - index);
            arr = newArray;

            System.out.println(Arrays.toString(newArray));

        }
    }
}
