package az.iktlab.javasiplessons.lesson13.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,3}";
//        String text = "Contact us at info@example.com or support@example.co.uk";

        String text = sc.nextLine();

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
        }

        String[] regEx = text.split(" : ");

        System.out.println(regEx);
    }
}
