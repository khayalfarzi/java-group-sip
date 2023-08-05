package az.iktlab.javasiplessons.lesson19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(div(24, 0));
    }

    private static double div(int elem1, int elem2) throws ArithmeticException {

        try {

//            try {
//
//            }
            return elem1 / elem2;
        } catch (IndexOutOfBoundsException ex) {

            System.out.printf("Error occurred when " +
                    "divide %s to %s\n", elem1, elem2);

            System.out.println(ex.getMessage());

//            ex.printStackTrace();

            return 0;
        } catch (NullPointerException ex) {
            System.out.println("Null pointer exception occurred");

            return 0;
        } catch (RuntimeException ex) {
            System.out.println("Runtime exception occurred");

            throw new RuntimeException("UNKNOWN_ERROR_OCCURRED");
        } finally {
            System.out.println("Process end");
        }
    }

    private static int sub(int elem1, int elem2) {
        return elem1 + elem2;
    }

    private static void readFile() {
        File file = new File("/dir/file.ext");

        try {
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
