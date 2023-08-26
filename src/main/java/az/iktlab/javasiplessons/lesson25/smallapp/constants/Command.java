package az.iktlab.javasiplessons.lesson25.smallapp.constants;

public enum Command {

    SP("SAVE PERSON"),
    RU("REGISTER USER"),
    SHP("SHOW PEOPLE"),
    EXIT("EXIT"),
    UNDEFINED("UNDEFINED COMMAND");


    private final String description;

    Command(String name) {
        this.description = name;
    }

    public String getDescription() {
        return description;
    }
}
