package az.iktlab.javasiplessons.lesson4;

import java.util.Scanner;

public class CheckNumberExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int elem = sc.nextInt();
        String result;
        if (elem < 0) {
            result = "negative";
        } else if (elem > 0) {
            result = "positive";
        } else result = "zero";

        System.out.println(result);

        result = elem < 0 ? "negative" : "positive";
        result = elem < 0 ? "negative" : elem > 0 ? "positive" : "zero";
    }
}
