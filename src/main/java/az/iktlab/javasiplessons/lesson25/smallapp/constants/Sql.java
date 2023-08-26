package az.iktlab.javasiplessons.lesson25.smallapp.constants;

public enum Sql {

    INSERT_PERSON("INSERT INTO PERSON " +
            "(name, surname, fatherName, age, gender) values('%s', '%s', '%s', %s, '%s')"),
    FIND_ALL("SELECT * FROM person"),

    INSERT_USER("INSERT INTO user (person_id, username, password) values (%s, '%s', '%s')"),

    FIND_BY_ID("SELECT COUNT(*) as count FROM person WHERE id = %s");
    private final String value;

    Sql(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
