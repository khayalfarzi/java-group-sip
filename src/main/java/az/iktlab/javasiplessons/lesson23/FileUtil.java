package az.iktlab.javasiplessons.lesson23;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class FileUtil {

    public static String parseData(List<Person> people) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.writeValueAsString(people);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeToFile(String data, String path) {

        File file = new File(path);

        try (FileWriter writer = new FileWriter(file)) {
            if (!file.exists())
                file.createNewFile();

            writer.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Person> readFromFile(String path) {

        File file = new File(path);

        try (InputStream is = new FileInputStream(file)) {

            ObjectMapper mapper = new ObjectMapper();

            return null;

//           return mapper.readValue(is.read(2048), new TypeReference<List<Person>>(){});
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
