package az.iktlab.javasiplessons.lesson14.dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH-mm-ss");
        System.out.println(LocalDateTime.now().format(formatter));
    }
}
