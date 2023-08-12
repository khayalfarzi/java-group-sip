package az.iktlab.javasiplessons.lesson20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {

    public static void main(String[] args) {
        File file = new File("/Applications/idea/java-group-sip/docs/simple.txt");


        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNext())
                System.out.println(sc.nextLine());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
