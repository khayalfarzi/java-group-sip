package az.iktlab.javasiplessons.lesson12.enums;

public class Main {

    public static void main(String[] args) {

        System.out.println(DayOfWeek.MONDAY);

        System.out.println(DayOfWeekE.MONDAY);

        for (DayOfWeekE day : DayOfWeekE.values())
            System.out.println(day);

        DayOfWeekE day = DayOfWeekE.MONDAY;

        switch (day) {
            case MONDAY -> System.out.println(DayOfWeekE.MONDAY.getDescription());
        }

    }
}
