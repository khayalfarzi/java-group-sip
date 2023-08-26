package az.iktlab.javasiplessons.lesson25.smallapp.service;

import az.iktlab.javasiplessons.lesson25.smallapp.dao.PersonRepo;
import az.iktlab.javasiplessons.lesson25.smallapp.dao.UserRepo;
import az.iktlab.javasiplessons.lesson25.smallapp.model.User;

public class UserService {
    private final PersonRepo personRepo = new PersonRepo();
    private final UserRepo userRepo = new UserRepo();

    public void save(User user) {

        if (!personRepo.exist(user.getPerson().getId()))
            throw new RuntimeException("PERSON NOT EXIST");

        userRepo.save(user);
    }

}
