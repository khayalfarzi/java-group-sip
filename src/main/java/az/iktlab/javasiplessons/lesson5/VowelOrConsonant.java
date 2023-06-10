package az.iktlab.javasiplessons.lesson5;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String vowels = "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";

        System.out.print("Enter character: ");
        String input = sc.next().toLowerCase();

        if (input.length() != 1) {
            System.out.println("Character length must be 1");
        } else {
            if (vowels.contains(input))
                System.out.printf("Character %s is vowel", input);
            else if (consonants.contains(input))
                System.out.printf("Character %s is consonant", input);
            else System.out.printf("Character %s is not vowel or consonant", input);
        }
    }
}
