package az.iktlab.javasiplessons.lesson25.smallapp.dao;

import az.iktlab.javasiplessons.lesson25.smallapp.constants.Sql;
import az.iktlab.javasiplessons.lesson25.smallapp.model.Gender;
import az.iktlab.javasiplessons.lesson25.smallapp.model.Person;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class PersonRepo {

    public boolean exist(Long id) {
        var stmt = Db.getStatement(
                String.format(Sql.FIND_BY_ID.getValue(), id));

        try {
            var rs = stmt.getResultSet();
            return rs.getInt("count") != 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void save(Person person) {

        var stmt = Db.getStatement(String.format(Sql.INSERT_PERSON.getValue(),
                person.getName(),
                person.getSurname(),
                person.getFatherName(),
                person.getAge(),
                person.getGender()));

        try {
            if (stmt.execute())
                System.out.println("SUCCESSFULLY REGISTERED PERSON");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public List<Person> findAll() {

        var stmt = Db.getStatement(Sql.FIND_ALL.getValue());
        try {
            var rs = stmt.getResultSet();

            List<Person> people = new LinkedList<>();

            while (rs.next()) {
                Person person = new Person();
                person.setId(rs.getLong("id"));
                person.setName(rs.getString("name"));
                person.setSurname(rs.getString("surname"));
                person.setFatherName(rs.getString("father_name"));
                person.setAge(rs.getInt("age"));
                person.setGender(Gender.valueOf(rs.getString("gender")));

                people.add(person);
            }

            return people;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
