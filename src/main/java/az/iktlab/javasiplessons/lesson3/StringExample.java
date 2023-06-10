package az.iktlab.javasiplessons.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class StringExample {


    public static void main(String[] args) {


        char a = 'A';

        char[] hello = new char[]{'s', 'a', 'l', 'a', 'm'};

        String s = "Salam";
        String ss = new String("Salam");

        String apple = "Apple";
        String banana = "Banana";
        String apple1 = "Apple";

        apple = "Apple 1";

        String apple2 = new String("Apple");
        String banana2 = new String("Banana");
        String apple3 = new String("Apple");

        String msg = "Hello Java Students";

        System.out.println(msg);
        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());

        System.out.println(msg.charAt(6));

        System.out.println(msg.toCharArray());

        msg = msg.concat("New word");

        System.out.println(msg);

        System.out.println(msg.contains("word"));


        Scanner sc = new Scanner(System.in);
        String word = "Hello sip group";
        System.out.println(Arrays.toString(word.split(" ")));

        /**
         * String word = "Hello sip group";
         * */

        // abcd
        // cadb

        System.out.println("zc".compareTo("za"));
    }
}
