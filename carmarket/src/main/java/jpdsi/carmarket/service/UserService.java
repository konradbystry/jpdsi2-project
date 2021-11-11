package jpdsi.carmarket.service;

import jpdsi.carmarket.repo.UserRepo;

public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
}
