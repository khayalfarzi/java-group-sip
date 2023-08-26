package az.iktlab.javasiplessons.lesson25.smallapp.dao;

import az.iktlab.javasiplessons.lesson25.smallapp.constants.Sql;
import az.iktlab.javasiplessons.lesson25.smallapp.model.User;

import java.sql.SQLException;

public class UserRepo {

    public void save(User user) {

        var stmt = Db.getStatement(
                String.format(Sql.INSERT_USER.getValue(),
                        user.getPerson().getId(),
                        user.getUsername(),
                        user.getPerson()));

        try {
            if (stmt.execute())
                System.out.println("SUCCESSFULLY REGISTERED USER");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
