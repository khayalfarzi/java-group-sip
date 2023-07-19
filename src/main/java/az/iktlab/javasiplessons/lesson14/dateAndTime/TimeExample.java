package az.iktlab.javasiplessons.lesson14.dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeExample {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        System.out.println("Now : " + time);

        System.out.println("Minute: " + time.getMinute());

        System.out.println("Hour: " + time.getHour());

        System.out.println("Plus minute: " + time.plusMinutes(2));

        System.out.println("Max hour: " + LocalTime.MAX);

        System.out.println("Min hour: " + LocalTime.MIN);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH-mm-ss");
        System.out.println(LocalTime.now().format(formatter));

    }
}
