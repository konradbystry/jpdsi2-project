package jpdsi.carmarket.service;

import jpdsi.carmarket.exception.UserNotFoundException;
import jpdsi.carmarket.model.User;
import jpdsi.carmarket.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public User updateUser(User user) {
        return userRepo.save(user);
    }

    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }

    public User findUserById(Long id) {
        return (User) userRepo.findUserById(id).orElseThrow(()-> new UserNotFoundException("User with id " + id + " was not found"));
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }
}