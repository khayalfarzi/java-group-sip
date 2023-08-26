package az.iktlab.javasiplessons.lesson25.smallapp.util;

import az.iktlab.javasiplessons.lesson25.smallapp.constants.Command;
import az.iktlab.javasiplessons.lesson25.smallapp.model.Gender;
import az.iktlab.javasiplessons.lesson25.smallapp.model.Person;
import az.iktlab.javasiplessons.lesson25.smallapp.model.User;

import java.util.Scanner;

public class ScannerUtil {

    private ScannerUtil() {

    }

    private static final Scanner sc = new Scanner(System.in);

    public static Person getPersonData() {

        System.out.print("ENTER NAME: ");
        var name = sc.nextLine();

        System.out.print("ENTER SURNAME: ");
        var surname = sc.nextLine();

        System.out.print("ENTER FATER NAME: \n");
        var fatherName = sc.nextLine();

        System.out.print("ENTER AGE: ");
        var age = sc.nextInt();

        System.out.print("ENTER GENDER. (MALE OR FEMALE): ");
        var gender = getGender(sc.nextLine());

        return new Person(null, name, surname, fatherName, age, gender);
    }

    public static User getUserData() {
        System.out.print("ENTER USER ID: ");
        var personId = sc.nextLong();

        System.out.print("ENTER USERNAME: ");
        var username = sc.nextLine();

        System.out.print("ENTER PASSWORD: ");
        var password = sc.nextLine();

        var user = new User();
        var person = new Person();
        person.setId(personId);
        user.setPerson(person);
        user.setUsername(username);
        user.setPassword(password);


        return user;
    }

    public static Command getCommand() {
        String cmd = sc.nextLine();
        return getCommand(cmd);
    }

    private static Command getCommand(String cmd) {
        try {
            return Command.valueOf(cmd.toUpperCase());
        } catch (RuntimeException ex) {
            return Command.UNDEFINED;
        }
    }

    private static Gender getGender(String gender) {
        try {
            return Gender.valueOf(gender);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            return Gender.MALE;
        }
    }
}
