package az.iktlab.javasiplessons.lesson22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        selectById(1);
        insert("Khayal", "Farziyev", 78);
    }

    private static void selectById(int id) {
        try {
            String selectById = "SELECT * FROM person WHERE id = " + id;
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(selectById);

            while (rs.next()) {
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int age = rs.getInt("age");

                System.out.println("NAME: " + name);
                System.out.println("SURNAME: " + surname);
                System.out.println("AGE: " + age);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static void insert(String name, String surname, int age) {
        try {
            String selectById = String.format("INSERT INTO person (name, surname, age) VALUES ('%s', '%s', %s)", name, surname, age);
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres");

            Statement stmt = con.createStatement();

            boolean isExecuted = stmt.execute(selectById);

            System.out.println(isExecuted);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
