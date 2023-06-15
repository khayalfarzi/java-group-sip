package az.iktlab.javasiplessons.lesson6;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 7;
        int d = 8;

        int arr[] = {5, 6, 7, 8};
        String strArr[] = {"str", "mtr"};

        int arr1[] = new int[5];
        // [0, 0, 0, 0, 0]
        //  0, 1, 2, 3, 4

        arr1[0] = 4;
        arr1[1] = 8;
        arr1[2] = 19;
        arr1[3] = 24;
        arr1[4] = 12;

        System.out.println(Arrays.toString(arr1));

        System.out.println(arr1[3]); // 24
//        System.out.println(arr1[5]); // throw exception

        arr1[3] = 89;

        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }



    }
}
