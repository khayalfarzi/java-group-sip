package az.iktlab.javasiplessons.lesson25.smallapp.controller;

import az.iktlab.javasiplessons.lesson25.smallapp.model.User;
import az.iktlab.javasiplessons.lesson25.smallapp.service.UserService;

public class UserController {
    private final UserService userService = new UserService();

    public void register(User user) {
        userService.save(user);
    }
}
