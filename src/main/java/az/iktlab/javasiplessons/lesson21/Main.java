package az.iktlab.javasiplessons.lesson21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("/Applications/idea/java-group-sip/docs/people.json");
        List<String>list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                sc.next().substring(1);
                String s = sc.nextLine().split(",")[0];
                if(s!="")
                    list.add(s);

            }
            System.out.printf(String.valueOf(list));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
