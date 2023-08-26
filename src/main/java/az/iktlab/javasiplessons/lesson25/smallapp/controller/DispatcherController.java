package az.iktlab.javasiplessons.lesson25.smallapp.controller;

import az.iktlab.javasiplessons.lesson25.smallapp.constants.Command;

import java.util.Arrays;

import static az.iktlab.javasiplessons.lesson25.smallapp.util.ScannerUtil.getCommand;
import static az.iktlab.javasiplessons.lesson25.smallapp.util.ScannerUtil.getPersonData;
import static az.iktlab.javasiplessons.lesson25.smallapp.util.ScannerUtil.getUserData;

public class DispatcherController {
    private final PersonController personController = new PersonController();
    private final UserController userController = new UserController();

    public void runCommand() {
        boolean flag = true;
        while (flag) {
            showCommands();
            var command = getCommand();

            switch (command) {
                case SP -> {
                    var person = getPersonData();
                    personController.save(person);
                }
                case RU -> {
                    var user = getUserData();
                    userController.register(user);
                }
                case SHP -> personController.findAll();
                case EXIT -> flag = false;
                default -> System.out.println("ENTER VALID COMMAND");
            }
        }
    }

    private void showCommands() {
        Arrays.stream(Command.values())
                .forEach(it -> System.out.printf("%s - %s \n", it, it.getDescription()));
    }
}
