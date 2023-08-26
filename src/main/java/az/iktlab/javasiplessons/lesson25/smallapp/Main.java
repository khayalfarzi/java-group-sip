package az.iktlab.javasiplessons.lesson25.smallapp;

import az.iktlab.javasiplessons.lesson25.smallapp.controller.DispatcherController;

import java.util.Scanner;

public class Main {

    private static final DispatcherController dispatcherController = new DispatcherController();

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        System.out.println("WELCOME TO APPLICATION");

        dispatcherController.runCommand();

        System.out.println("GOOD BYE");
    }
}
