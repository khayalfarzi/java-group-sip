package az.iktlab.javasiplessons.lesson20;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File file = new File("/Applications/idea/java-group-sip/docs/simple.txt");

        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());

        try {
            file.createNewFile();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        file.delete();

        System.out.println(file.exists());

        System.out.println(file.length());

//        file.mkdir();
    }
}
