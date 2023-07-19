package az.iktlab.javasiplessons.lesson14.dateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExample {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        System.out.println("Now : " + date);

        System.out.println("Day: " + date.getDayOfMonth());

        System.out.println("Year: " + date.getYear());

        System.out.println("Plus day: " + date.plusDays(2));

        System.out.println("Max Day: " + LocalDate.MAX);

        System.out.println("Min Day: " + LocalDate.MIN);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(LocalDate.now().format(formatter));
    }
}
