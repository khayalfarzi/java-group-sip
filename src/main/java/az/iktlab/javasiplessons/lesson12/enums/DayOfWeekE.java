package az.iktlab.javasiplessons.lesson12.enums;

public enum DayOfWeekE {

    MONDAY("Ilk is gunu"),
    TUESDAY(""),
    WEDNESDAY(""),
    THURSDAY(""),
    FRIDAY(""),
    SATURDAY(""),
    SUNDAY("");

    DayOfWeekE(String description) {
        this.description = description;
    }

    private final String description;

    public String getDescription() {
        return description;
    }
}
