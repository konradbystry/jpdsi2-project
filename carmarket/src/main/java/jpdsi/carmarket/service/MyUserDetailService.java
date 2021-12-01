package jpdsi.carmarket.service;

import jpdsi.carmarket.exception.UserNotFoundException;
import jpdsi.carmarket.model.MyUserDetails;
import jpdsi.carmarket.model.User;
import jpdsi.carmarket.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepo.findByUserName(userName);

        user.orElseThrow(()-> new UserNotFoundException(userName + " not found"));

        return user.map(MyUserDetails::new).get();
    }
}
