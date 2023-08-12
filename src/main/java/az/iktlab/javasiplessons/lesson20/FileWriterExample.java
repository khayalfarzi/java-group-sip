package az.iktlab.javasiplessons.lesson20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        File file = new File("/Applications/idea/java-group-sip/docs/simple.txt");

        try (FileWriter writer = new FileWriter(file)) {

            for (int i = 0; i < 500; i++) {
                writer.write("Salam\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch (RuntimeException ex){

        }
    }
}
