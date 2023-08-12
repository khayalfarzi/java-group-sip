package az.iktlab.javasiplessons.lesson20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class JsonParser {

    private static final String PATH = "/Applications/idea/java-group-sip/docs/people.json";

    public static void main(String[] args) {
        String data = getJsonData(PATH);
        List<Person> personList = parseFile(data);
        print(personList);
    }

    private static void print(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static List<Person> parseFile(String jsonString) {
        List<Person> personList = new LinkedList<>();

        String[] personEntries = jsonString.split("},");

        for (String personEntry : personEntries) {

            String[] attributes = personEntry.split(",");

            String name = extractAttributeValue(attributes[0]);
            String surname = extractAttributeValue(attributes[1]);
            int age = Integer.parseInt(extractAttributeValue(attributes[2]));
            String gender = extractAttributeValue(attributes[3]);
            String birthDate = extractAttributeValue(attributes[4]);

            Person person = new Person(name, surname, age, gender, birthDate);
            personList.add(person);
        }
        return personList;
    }

    private static String getJsonData(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            StringBuilder jsonContent = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                jsonContent.append(line.trim());
            }

            String jsonString = jsonContent.toString();
            jsonString = jsonString.substring(1, jsonString.length() - 1);

            return jsonString;
        } catch (IOException e) {
            System.out.println("Error while parsing json");
            System.out.println("Error message is: " + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }

    private static String extractAttributeValue(String attribute) {
        String[] parts = attribute.split(":");
        String value = parts[1].trim();

        if (value.startsWith("\"") && value.endsWith("\"")) {
            value = value.substring(1, value.length() - 1);
            return value;
        } else {
            System.out.println("Error while extracting data from file");
            System.out.println("Data is: " + attribute);
            throw new RuntimeException("ERROR_WHILE_EXTRACTING_DATA");
        }
    }
}